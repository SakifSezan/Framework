package StepDefinition;

import PageAction.HomePageAction;
import PageAction.SignInpageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Functions_BestBuy_SignIn extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction(); 
	SignInpageAction signInpageAction = new SignInpageAction();
	

@Given("^Launh BestBuy <\"([^\"]*)\">$")
public void launh_BestBuy(String URL) throws Throwable {
	LaunchURL(URL);
}

@Then("^Click on Account button$")
public void click_on_Account_button() throws Throwable {
	homePageAction.ClickonAccountbutton();
}

@Then("^Click Signin button$")
public void click_Signin_button() throws Throwable {
	homePageAction.ClickSigninbutton();
}

@Then("^Enter email enter password and Click Signin button$")
public void enter_email_enter_password_and_Click_Signin_button() throws Throwable {
	signInpageAction.EnteremailenterpasswordandClickSigninbutton(Prop.getProperty("E_Address"), Prop.getProperty("BB_Password"));
	
}

@Then("^Verify user can sign in smoothly$")
public void verify_user_can_sign_in_smoothly() throws Throwable {
   
}



}
