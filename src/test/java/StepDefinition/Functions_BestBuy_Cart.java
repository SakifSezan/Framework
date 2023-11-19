package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Functions_BestBuy_Cart extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	
	@Given("^Launh BestBuy <\"([^\"]*)\"> application$")
	public void launh_BestBuy_application(String URL) throws Throwable {
		LaunchURL(URL);
		
	}

	@Then("^Search Macbook Pro in the search box and click search icon$")
	public void search_Macbook_Pro_in_the_search_box_and_click_search_icon() throws Throwable {
		homePageAction.SearchMacbookProinthesearchboxandclicksearchicon();
		
	}

	@Then("^Look for item and Click Add to Cart button$")
	public void look_for_item_and_Click_Add_to_Cart_button() throws Throwable {
	   
	}

	@Then("^Click Go to cart button from the popup page$")
	public void click_Go_to_cart_button_from_the_popup_page() throws Throwable {
	    
	}

	@Then("^Take a screenshot$")
	public void take_a_screenshot() throws Throwable {
	  
	}

	@Then("^Click on checkout button$")
	public void click_on_checkout_button() throws Throwable {
	    
	}



}
