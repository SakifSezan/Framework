package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDeffClass extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launch <\"([^\"]*)\"> application$")
	public void launch_application(String URL) throws Throwable {
		LaunchURL(URL);
		
	}

	@Then("^Click About us link$")
	public void click_About_us_link() throws Throwable {
		homePageAction.ClickAboutuslink();
		System.out.println("This is the About us page");
		
	}

	@Then("^Verify user can click About us link$")
	public void verify_user_can_click_About_us_link() throws Throwable {
	    
		homePageAction.VerifyusercanclickAboutuslink();
	}



}
