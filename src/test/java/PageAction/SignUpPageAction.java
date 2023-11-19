package PageAction;

import PageLocator.SignUpPageLocator;
import Utility.BaseClass;
import Utility.TestDataClass;

public class SignUpPageAction extends BaseClass {
	
	SignUpPageLocator signUpPageLocator = new SignUpPageLocator();
	
	public void Enternameemailpasswoedconfirmpasswordmobilenumber() {
		signUpPageLocator.FirstName.sendKeys(TestDataClass.F_name);
		signUpPageLocator.LastName.sendKeys(TestDataClass.L_name);
		signUpPageLocator.Email.sendKeys(TestDataClass.E_Address);
		signUpPageLocator.Password.sendKeys(TestDataClass.Password);
		signUpPageLocator.ConfirmPassword.sendKeys(TestDataClass.C_Password);
		signUpPageLocator.Phone.sendKeys(TestDataClass.Phone);
		
	}
	public void ClickCreateanAccountbutton() {
		signUpPageLocator.CreateAccountButton.click();
	}

}
