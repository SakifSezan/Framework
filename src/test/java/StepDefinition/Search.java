package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Search extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launh <\"([^\"]*)\"> JCPenney$")
	public void launh_JCPenney(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Type Mens Cologn & click search icon$")
	public void type_Mens_Cologn_click_search_icon() throws Throwable {
		homePageAction.TypeMensColognclicksearchicon();
		
		
	}

	@Then("^Verify user can search items is searchbox$")
	public void verify_user_can_search_items_is_searchbox() throws Throwable {
		homePageAction.Verifyusercansearchitemsinsearchbox();
		
	}



}
