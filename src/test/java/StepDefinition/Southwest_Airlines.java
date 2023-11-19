package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Southwest_Airlines extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launh <\"([^\"]*)\"> Southwest Airlines$")
	public void launh_Southwest_Airlines(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Select Depart and Arrival destinations$")
	public void select_Depart_and_Arrival_destinations() throws Throwable {
		homePageAction.SelecDepartandArrivaldestinations();
	}

	@Then("^Select dates and select passengers$")
	public void select_dates_and_select_passengers() throws Throwable {
		homePageAction.Selectdatesandselectpassengers();
	}

	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
		homePageAction.ClickonSearchbutton();
	}



}
