package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchasePhones {

	@FindBy (xpath="//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")
	public WebElement Nokia;
	
	@FindBy (xpath =  "//*[@id=\"tbodyid\"]/div[2]/div/a")
	public WebElement Addtocart;
	
	
	

}
