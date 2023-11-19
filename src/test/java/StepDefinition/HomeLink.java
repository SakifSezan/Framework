package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomeLink extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launch NET <\"([^\"]*)\">$")
	public void launch_NET(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Click on About us link and click on Home link again$")
	public void click_on_About_us_link_and_click_on_Home_link_again() throws Throwable {
		homePageAction.ClickonAboutuslinkandclickonHomelinkagain();
	}

	@Then("^Verify use can click Home link and see Home page$")
	public void verify_use_can_click_Home_link_and_see_Home_page() throws Throwable {
		homePageAction.VerifyusecanclickHomelinkandseeHomepage();
	}



}
