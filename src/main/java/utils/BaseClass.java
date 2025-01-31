package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.Cart;
import pages.LoginPage;
import pages.PurchasePhones;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;

    static {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\tondu\\eclipse-workspace\\ravi\\demoblaze\\config.property");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialize() {
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Browser not supported!");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();

        driver.get(prop.getProperty("url"));
        String expectedTitle = "STORE";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");

        driver.findElement(By.xpath("//*[@id='login2']")).click();
        LoginPage lpg = PageFactory.initElements(driver, LoginPage.class);
        lpg.Username.sendKeys("Ravisankartr");
        lpg.Password.sendKeys("Ravi@123");
        lpg.Login.click();

        driver.navigate().refresh();
        Assert.assertFalse(driver.findElement(By.id("nameofuser")).isDisplayed(), "Login was not successful!");

        // Navigate to Phones page
        driver.findElement(By.id("itemc")).click();
        Assert.assertFalse(driver.getCurrentUrl().contains("phones"), "Navigation to Phones page failed!");

        // Purchase phones
        PurchasePhones pp = PageFactory.initElements(driver, PurchasePhones.class);
        pp.Nokia.click();
        pp.Addtocart.click();

        /*
        // Validate phone was added to cart
        Alert alert = driver.switchTo().alert();
        Assert.assertFalse(alert.getText(), "Product added.", "Product was not added to the cart!");
        alert.accept();
*/
        // Cart page actions
        Cart cart = PageFactory.initElements(driver, Cart.class);
        cart.AddtoCart.click();
        cart.PlaceOrder.click();

        // Fill in order details
        cart.Name.sendKeys("ABCD");
        cart.Country.sendKeys("IND");
        cart.City.sendKeys("HYD");
        cart.CreditCard.sendKeys("1234");
        cart.Month.sendKeys("JAN");
        cart.Year.sendKeys("2025");
        cart.Purchase.click();

        // Validate purchase confirmation
        WebElement confirmationMessage = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
        Assert.assertTrue(confirmationMessage.isDisplayed(), "Purchase confirmation message not displayed!");

        // Close the confirmation page
        driver.findElement(By.xpath("//button[text()='OK']")).click();
    }

    public String captureScreen(String tname) {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "-" + timestamp + ".png";
        File dest = new File(targetFilePath);
        return targetFilePath;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
