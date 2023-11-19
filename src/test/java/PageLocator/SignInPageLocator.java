package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class SignInPageLocator extends BaseClass {
	
	public SignInPageLocator() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "email")
    public WebElement Email;
    
    @FindBy(id = "password")
    public WebElement Password;
    
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement SignInButton;
    
    @FindBy(id = "fld-e")
    public WebElement EmailAddress;
    
    @FindBy(id = "fld-p1")
    public WebElement Pass;
    
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement SignIn;
    
    @FindBy(xpath = "//div[contains(text(),'Orders & Account')]")
    public WebElement AccountButton;
    
    @FindBy(id = "user-account")
    public WebElement EmailTemu;
    
    @FindBy(id = "submit-button")
    public WebElement ContinueButtonTemu;
    
    @FindBy(id = "pwdInputInLoginDialog")
    public WebElement PasswordTemu;
    
    @FindBy(id = "submit-button")
    public WebElement SigninButton;
    
    

}
