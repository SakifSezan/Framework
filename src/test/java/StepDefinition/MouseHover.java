package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MouseHover extends BaseClass {

	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launch <\"([^\"]*)\"> RGPS$")
	public void launch_RGPS(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Mouse hover to Academics link$")
	public void mouse_hover_to_Academics_link() throws Throwable {
		//Thread.sleep(2000);
		homePageAction.MousehovertoAcademicslink();
		
	}

	@Then("^Click on Library page$")
	public void click_on_Library_page() throws Throwable {
		homePageAction.ClickonLibrarypage();
		
	}

	@Then("^Verify user can mouse hover$")
	public void verify_user_can_mouse_hover() throws Throwable {
	   
	}


}
