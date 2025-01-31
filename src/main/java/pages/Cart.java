package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart {
	@FindBy (xpath ="//*[@id=\"navbarExample\"]/ul/li[4]/a")
	public WebElement AddtoCart;
	
	@FindBy (xpath = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
	public WebElement PlaceOrder;
	
	@FindBy (xpath = "//*[@id='name']")
	public WebElement Name;
	
	@FindBy (xpath = "//*[@id='country']")
	public WebElement Country;
	
	@FindBy (xpath = "//*[@id='city']")
	public WebElement City;
	
	@FindBy (xpath = "//*[@id='card']")
	public WebElement CreditCard;
	
	@FindBy (xpath ="//*[@id='month']" )
	public WebElement Month;
	
	@FindBy (xpath = "//*[@id='year']")
	public WebElement Year;
	
	@FindBy (xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	public WebElement Purchase;
	


}
