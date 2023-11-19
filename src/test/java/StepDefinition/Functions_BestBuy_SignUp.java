package StepDefinition;

import PageAction.HomePageAction;
import PageAction.SignUpPageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Functions_BestBuy_SignUp extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	SignUpPageAction signUpPageAction = new SignUpPageAction();
	
	@Given("^Launh <\"([^\"]*)\"> BestBuy$")
	public void launh_BestBuy(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Click on Account link$")
	public void click_on_Account_link() throws Throwable {
		homePageAction.ClickonAccountlink();
	}

	@Then("^Click Create Account button$")
	public void click_Create_Account_button() throws Throwable {
		homePageAction.ClickCreateAccountbutton();
	}

	@Then("^Enter name email passwoed confirm password mobile number$")
	public void enter_name_email_passwoed_confirm_password_mobile_number() throws Throwable {
		signUpPageAction.Enternameemailpasswoedconfirmpasswordmobilenumber();
	}

	@Then("^Click Create an Account button$")
	public void click_Create_an_Account_button() throws Throwable {
		signUpPageAction.ClickCreateanAccountbutton();
	}

}
