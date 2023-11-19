package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PlayVideo extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launch <\"([^\"]*)\"> NET$")
	public void launch_NET(String URL) throws Throwable {
	    
		LaunchURL(URL);
	}

	@Then("^Play the video$")
	public void play_the_video() throws Throwable {
		homePageAction.Playthevideo();
		
	
		
	}

	@Then("^Click the video$")
	public void click_the_video() throws Throwable {
		homePageAction.Clickthevideo();
		
	}



}
