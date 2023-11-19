package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Dell_MouseHover extends BaseClass {

	HomePageAction homePageAction = new HomePageAction();
	
	
	@Given("^Launh <\"([^\"]*)\"> Dell$")
	public void launh_Dell(String URL) throws Throwable {
		LaunchURL(URL);
	}
	
@Then("^Mouse hover to Computers link and droopdown to Laptops$")
public void mouse_hover_to_Computers_link_and_droopdown_to_Laptops() throws Throwable {
	homePageAction.MousehovertoComputerslinkanddropdowntoLaptops();
}

@Then("^The select XPS Laptops$")
public void the_select_XPS_Laptops() throws Throwable {
	homePageAction.TheselectXPSLaptops();
}

@Then("^Verify user can navigate to the desired page$")
public void verify_user_can_navigate_to_the_desired_page() throws Throwable {
   
}



}
