package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class SearchPageLocator extends BaseClass {
	
	public SearchPageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[text()='Drive-thru, carry-out, curbside or dine-in']")
	public WebElement PickUp;
	
	@FindBy(id = "input-1")
	public WebElement Houston;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/main/div[2]/div[2]/form/button")
	public WebElement FindRestaurant;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/main/div[2]/div[2]/div[2]/div[1]/ul/li[1]/div/div[2]/button")
	public WebElement SelectThisRestaurant;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/main/div[2]/div[2]/div[1]/ul/li[1]/button/div/div[1]/svg/path[1]")
	public WebElement DriveThru;
	
	@FindBy(xpath = "//h4[text()='Carry-out']")
	public WebElement CarryOut;
	
	@FindBy(xpath = "//h3[text()='Meals']")
	public WebElement Meals;
	
	@FindBy(xpath = "//h3[text()='Honey Pepper Pimento Chicken Sandwich Meal']")
	public WebElement HoneyPepper;
	
	@FindBy(xpath = "//button[text()='Next, choose a side']")
	public WebElement NextButton;
	
	@FindBy(xpath = "//h3[text()='Chick-fil-A Waffle Potato Fries']")
	public WebElement Fries;
	
	@FindBy(xpath = "//button[text()='Next, choose a beverage']")
	public WebElement Beverage;
	
	@FindBy(xpath = "//h6[text()=' Diet Lemonade']")
	public WebElement DietLemonade;
	
	@FindBy(xpath = "//button[text()='Review your meal']")
	public WebElement Review;
	
	@FindBy(xpath = "//button[text()='Add to order']")
	public WebElement AddOrder;
	
	//@FindBy(xpath = "//div[text()='My Order']")
	//public WebElement VerifyOrder;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/nav[1]/div[3]/button[2]")
	public WebElement MyOrderButton;
	
	@FindBy(xpath = "//button[text()='Check out']")
	public WebElement CheckOutButton;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	public WebElement SignInButton;
	
	@FindBy(xpath = "/html/body/main")
	public WebElement SigninVerfy;

}
