package StepDefinition;

import PageAction.HomePageAction;
import PageAction.SignInpageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Temu_Cart extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	SignInpageAction signInpageAction = new SignInpageAction ();
	
	@Given("^Launh <\"([^\"]*)\"> Temu$")
	public void launh_Temu(String URL) throws Throwable {
		LaunchURL(URL);
	   }
	@Then("^Enter email and click Continue button Enter password and click on signin button$")
	public void enter_email_and_click_Continue_button_Enter_password_and_click_on_signin_button() throws Throwable {
		signInpageAction.EnteremailandclickContinuebuttonEnterpasswordandclickonsigninbutton(Prop.getProperty("Email2"), Prop.getProperty("password2"));
	}
    @Then("^Search Monitor Light bar in the searchbox and click on Search icon$")
	public void search_Monitor_Light_bar_in_the_searchbox_and_click_on_Search_icon() throws Throwable {
		homePageAction.SearchMonitorLightbarinthesearchboxandclickonSearchicon();
	}

	@Then("^Select item and click on QTY and select (\\d+) and click on Add to Cart button$")
	public void select_item_and_click_on_QTY_and_select_and_click_on_Add_to_Cart_button(int arg1) throws Throwable {
	   
	}

	@Then("^Close Cart page and search wireless mechanical key board and click on Search icon$")
	public void close_Cart_page_and_search_wireless_mechanical_key_board_and_click_on_Search_icon() throws Throwable {
	    
	}

	@Then("^Select item and click on Red Switch option and click on Add to Cart button and Click Go to Cart button$")
	public void select_item_and_click_on_Red_Switch_option_and_click_on_Add_to_Cart_button_and_Click_Go_to_Cart_button() throws Throwable {
	    
	}

	@Then("^Click on Checkout button and Click on Continue as a Guest button$")
	public void click_on_Checkout_button_and_Click_on_Continue_as_a_Guest_button() throws Throwable {
	   
	}



}
