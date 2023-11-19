package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class AdmissionPageLocator extends BaseClass {
	
	public AdmissionPageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name = "FirstName")
	public WebElement FirstName;
	
	@FindBy(name = "LastName")
	public WebElement LastName;
	
	@FindBy(name = "Age")
	public WebElement Age;
	
	
	@FindBy(name = "FathersName")
	public WebElement FatherName;
	
	@FindBy(name = "MothersName")
	public WebElement MotherName;
	
	@FindBy(name = "Phone")
	public WebElement Phone;
	
	@FindBy(name = "Address")
	public WebElement Address;
	
	@FindBy(name = "AdmissionClass")
	public WebElement Class;
	
	@FindBy(name = "email")
	public WebElement Email;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[3]/div/div/div/div/form/div[10]/div/input")
	public WebElement Image;
	
	@FindBy(xpath = "/html/body/div/div[2]/div[3]/div[3]/div/div/div/div/form/input")
	public WebElement Submit;
	
	@FindBy(xpath = "//p[text()='file is Required']")
	public WebElement Failed;

}
