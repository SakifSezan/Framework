package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class SignUpPageLocator extends BaseClass {
	
	public SignUpPageLocator() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "firstName")
	public WebElement FirstName;
	
	@FindBy(id = "lastName")
	public WebElement LastName;
	
	@FindBy(id = "email")
	public WebElement Email;
	
	@FindBy(id = "fld-p1")
	public WebElement Password;
	
	@FindBy(id = "reenterPassword")
	public WebElement ConfirmPassword;
	
	@FindBy(id = "phone")
	public WebElement Phone;
	
	@FindBy(xpath = "//button[text()='Create an Account']")
	public WebElement CreateAccountButton;
	
	

}
