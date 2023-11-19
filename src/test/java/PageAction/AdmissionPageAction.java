package PageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageLocator.AdmissionPageLocator;
import Utility.BaseClass;
import Utility.TestDataClass;
import Utility.UtilityClass;

public class AdmissionPageAction extends BaseClass{
	
	AdmissionPageLocator admissionPageLocator = new AdmissionPageLocator();
	
	public void ScrolldowntillFirstName() throws Exception {
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
		
	}
public void Fillouttheform() {
	admissionPageLocator.FirstName.sendKeys(TestDataClass.First);
	admissionPageLocator.LastName.sendKeys(TestDataClass.Last);
	admissionPageLocator.Age.sendKeys(TestDataClass.Age);
	admissionPageLocator.FatherName.sendKeys(TestDataClass.FathersName);
	admissionPageLocator.MotherName.sendKeys(TestDataClass.MotherName);
	admissionPageLocator.Phone.sendKeys(TestDataClass.PhoneNumber);
	admissionPageLocator.Address.sendKeys(TestDataClass.Address);
	
	Select SL = new Select(driver.findElement(By.name("AdmissionClass")));
	SL.selectByIndex(4);
	
	admissionPageLocator.Email.sendKeys(TestDataClass.Email);
    	
}

public void ClickSubmitbutton() {
	admissionPageLocator.Submit.click();
	
}
public void Verifyusercanapply() throws Exception {
	boolean FailedTest = admissionPageLocator.Failed.isDisplayed();
	Thread.sleep(1000);
	Assert.assertTrue(FailedTest);
	System.out.println("SORRY!!! Test Failed");
	
	((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
	UtilityClass.takeMyScreenshot(driver, "FailedTest");
}
	
}
