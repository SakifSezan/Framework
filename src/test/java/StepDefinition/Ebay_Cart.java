package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Ebay_Cart extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launh ebay <\"([^\"]*)\">$")
	public void launh_ebay(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Search Laptops in searchbox$")
	public void search_Laptops_in_searchbox() throws Throwable {
		homePageAction.SearchLaptopsinsearchbox();
	}

	@Then("^Add Lenovo Thinkpad X(\\d+) in the cart$")
	public void add_Lenovo_Thinkpad_X_in_the_cart(int arg1) throws Throwable {
		homePageAction.AddLenovoThinkpadX1inthecart();
	}

	@Then("^Click Add to Cart button and Proceed to Checkout$")
	public void click_Add_to_Cart_button_and_Proceed_to_Checkout() throws Throwable {
		homePageAction.ClickAddtoCartbuttonandProceedtoCheckout();
	}

	@Then("^Click Go To Checkout$")
	public void click_Go_To_Checkout() throws Throwable {
	   
	}

	@Then("^Hit Continue As Guest$")
	public void hit_Continue_As_Guest() throws Throwable {
	 
	}

	@Then("^Verify user can add items in cart and land in the payment page$")
	public void verify_user_can_add_items_in_cart_and_land_in_the_payment_page() throws Throwable {
	  
	}



}
