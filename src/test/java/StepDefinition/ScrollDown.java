package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ScrollDown extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launh <\"([^\"]*)\">$")
	public void launh(String URL) throws Throwable {
		LaunchURL(URL);
		
	}

	@Then("^Scroll down the webpage$")
	public void scroll_down_the_webpage() throws Throwable {
		Thread.sleep(3000);
		homePageAction.Scrolldownthewebpage();
		
		
	}



}
