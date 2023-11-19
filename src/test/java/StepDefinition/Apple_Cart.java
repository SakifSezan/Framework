package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Apple_Cart extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launh <\"([^\"]*)\"> Apple$")
	public void launh_Apple(String URL) throws Throwable {
		LaunchURL(URL);
	}
	
	@Then("^Click on Buy button and Scroll down the page and click on (\\d+) pro max link and choose Blue Titanium color$")
	public void click_on_Buy_button_and_Scroll_down_the_page_and_click_on_pro_max_link_and_choose_Blue_Titanium_color(int arg1) throws Throwable {
		homePageAction.ClickonBuybuttonandScrolldownthepageandclickon15promaxlinkandchooseBlueTitaniumcolor();
	}

	@Then("^Scroll down the page and Click on (\\d+)TB link select No Trade in button and click on Buy button$")
	public void scroll_down_the_page_and_Click_on_TB_link_select_No_Trade_in_button_and_click_on_Buy_button(int arg1) throws Throwable {
		homePageAction.ScrolldownthepageandClickon1TBlinkselectNoTradeinbuttonandclickonBuybutton();
	}

	@Then("^Click on Connect to Carrier Later button and click on No coverage link$")
	public void click_on_Connect_to_Carrier_Later_button_and_click_on_No_coverage_link() throws Throwable {
		homePageAction.ClickonConnecttoCarrierLaterbuttonandclickonNocoveragelink();
	}

	@Then("^Scroll down and click on Add to bag button and click on Review bag and click Checkout button and click Continue as Guest button$")
	public void scroll_down_and_click_on_Add_to_bag_button_and_click_on_Review_bag_and_click_Checkout_button_and_click_Continue_as_Guest_button() throws Throwable {
		homePageAction.ScrolldownandclickonAddtobagbuttonandclickonReviewbagandclickCheckoutbuttonandclickContinueasGuestbutton();
	}

	@Then("^Verify user can buy an iphone (\\d+) pro max$")
	public void verify_user_can_buy_an_iphone_pro_max(int arg1) throws Throwable {
		homePageAction.Verifyusercanbuyaniphone15promax();
	}



}
