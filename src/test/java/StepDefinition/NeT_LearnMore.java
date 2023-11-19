package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NeT_LearnMore extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();

	@Given("^Launch NeT <\"([^\"]*)\">$")
	public void launch_NeT(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Verify Learn More button is displaying$")
	public void verify_Learn_More_button_is_displaying() throws Throwable {
		homePageAction.VerifyLearnMorebuttonisdisplaying();
	}


}
