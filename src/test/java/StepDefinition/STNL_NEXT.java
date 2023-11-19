package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class STNL_NEXT extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launch NEXTeTICKET <\"([^\"]*)\">$")
	public void launch_NEXTeTICKET(String URL) throws Throwable {
		LaunchURL(URL);
	   
	}

	@Then("^Scroll down till STNL Enter Email adress and click Send button$")
	public void scroll_down_till_STNL_Enter_Email_adress_and_click_Send_button() throws Throwable {
		homePageAction.ScrolldowntillSTNLEnterEmailadressandclickSendbutton(Prop.getProperty("NextEmail"));
	}

	@Then("^Verify Success message is displaying after sent with email$")
	public void verify_Success_message_is_displaying_after_sent_with_email() throws Throwable {
		homePageAction.VerifySuccessmessageisdisplayingaftersentwithemail();
	}



}
