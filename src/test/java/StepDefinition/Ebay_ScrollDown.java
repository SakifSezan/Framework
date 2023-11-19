package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Ebay_ScrollDown extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launh ebay <\"([^\"]*)\"> application$")
	public void launh_ebay_application(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Click on Brand outlet link ands click on Clothing link$")
	public void click_on_Brand_outlet_link_ands_click_on_Clothing_link() throws Throwable {
		homePageAction.ClickonBrandoutletlinkandsclickonClothinglink();
	}

	@Then("^Select Champion link and Scroll downthe page$")
	public void select_Champion_link_and_Scroll_downthe_page() throws Throwable {
		homePageAction.SelectChampionlinkandScrolldownthepage();
	}

	@Then("^Select Free Shipping box and Scroll down to the bottom of the page$")
	public void select_Free_Shipping_box_and_Scroll_down_to_the_bottom_of_the_page() throws Throwable {
		homePageAction.SelectFreeShippingboxandScrolldowntothebottomofthepage();
	}



}
