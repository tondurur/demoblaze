package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	

	@FindBy (xpath ="//*[@id='loginusername']")
	public WebElement Username;
	
	@FindBy (xpath =  "//*[@id='loginpassword']")
	public WebElement Password;
	
	
	@FindBy (xpath ="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]" )
	public WebElement Login;

}
