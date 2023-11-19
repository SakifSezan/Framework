package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DropDown extends BaseClass {

	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launch <\"([^\"]*)\"> OpenCart$")
	public void launch_OpenCart(String URL) throws Throwable {
		LaunchURL(URL);
		
	}

	@Then("^Mouse hover to Desktop link$")
	public void mouse_hover_to_Desktop_link() throws Throwable {
		homePageAction.MousehovertoDesktoplink();
		
	}

	@Then("^Drop down to Show All Catagory$")
	public void drop_down_to_Show_All_Catagory() throws Throwable {
		homePageAction.DropdowntoShowAllCatagory();
		
	}


}
