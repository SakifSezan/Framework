package PageAction;

import PageLocator.SignInPageLocator;
import Utility.BaseClass;

public class SignInpageAction extends BaseClass {
	
	SignInPageLocator signInPageLocator = new SignInPageLocator();
	
	public void EnterEmailandPasswordandClickSigninbutton(String e, String p) {
		
		signInPageLocator.Email.sendKeys(e);
		signInPageLocator.Password.sendKeys(p);
		signInPageLocator.SignInButton.click();
		
	}
	public void EnteremailenterpasswordandClickSigninbutton(String E, String P) {

		signInPageLocator.EmailAddress.sendKeys(E);
		signInPageLocator.Pass.sendKeys(P);
		signInPageLocator.SignIn.click();
		
	}
	public void EnteremailandclickContinuebuttonEnterpasswordandclickonsigninbutton(String E2, String P2) {
		//signInPageLocator.AccountButton.click();
		
		signInPageLocator.EmailTemu.sendKeys(E2);
		signInPageLocator.ContinueButtonTemu.click();
		
		signInPageLocator.PasswordTemu.sendKeys(P2);
		signInPageLocator.SignIn.click();
	}
	
		
	}
	
	

