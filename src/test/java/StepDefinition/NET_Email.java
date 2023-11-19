package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NET_Email extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launch NextETicket <\"([^\"]*)\">$")
	public void launch_NextETicket(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Scroll down to Subscribe to newsletter$")
	public void scroll_down_to_Subscribe_to_newsletter() throws Throwable {
	    Thread.sleep(1000);
		homePageAction.ScrolldowntoSubscribetonewsletter(Prop.getProperty("Email"));
	}

	@Then("^Verify user can sent email and get Successful message$")
	public void verify_user_can_sent_email_and_get_Successful_message() throws Throwable {
		homePageAction.Verifyusercansearchitemsinsearchbox();
	}



}
