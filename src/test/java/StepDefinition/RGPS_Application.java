package StepDefinition;

import PageAction.AdmissionPageAction;
import PageAction.HomePageAction;
import PageAction.SignInpageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RGPS_Application extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	SignInpageAction signInpageAction = new SignInpageAction();
	AdmissionPageAction admissionPageAction = new AdmissionPageAction();
	
	@Given("^Launh RGPS <\"([^\"]*)\">$")
	public void launh_RGPS(String URL) throws Throwable {
		LaunchURL(URL);
	    
	}

	@Then("^Click Apply Now button$")
	public void click_Apply_Now_button() throws Throwable {
		homePageAction.ClickApplyNowbutton();
		
	}
	
	@Then("^Enter Email and Password and Click Sign in button$")
	public void enter_Email_and_Password_and_Click_Sign_in_button() throws Throwable {
		signInpageAction.EnterEmailandPasswordandClickSigninbutton(Prop.getProperty("Email"), Prop.getProperty("Password"));
	   
		
	}

	@Then("^Scroll down till First Name$")
	public void scroll_down_till_First_Name() throws Throwable {
		admissionPageAction.ScrolldowntillFirstName();
	    
	}

	@Then("^Fill out the form$")
	public void fill_out_the_form() throws Throwable {
		admissionPageAction.Fillouttheform();
	   
	}

	@Then("^Click Submit button$")
	public void click_Submit_button() throws Throwable {
		admissionPageAction.ClickSubmitbutton();
	}

	@Then("^Verify user can apply$")
	public void verify_user_can_apply() throws Throwable {
		admissionPageAction.Verifyusercanapply();
	}


	
	

}
