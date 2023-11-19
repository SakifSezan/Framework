package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Ebay extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	

@Given("^Launh <\"([^\"]*)\"> ebay$")
public void launh_ebay(String URL) throws Throwable {
	LaunchURL(URL);
}

@Then("^Click on Daily Deals$")
public void click_on_Daily_Deals() throws Throwable {
	homePageAction.ClickonDailyDeals();
	
}

@Then("^Mouse hover to Techs$")
public void mouse_hover_to_Techs() throws Throwable {
	homePageAction.MousehovertoTechs();
   
}

@Then("^Click Cell phones$")
public void click_Cell_phones() throws Throwable {
	homePageAction.ClickCellphones();
}

@Then("^Verify user can drop down on ebay$")
public void verify_user_can_drop_down_on_ebay() throws Throwable {
	homePageAction.Verifyusercandropdownonebay();
	
}



}
