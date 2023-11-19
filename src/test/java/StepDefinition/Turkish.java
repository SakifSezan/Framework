package StepDefinition;

import PageAction.HomePageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Turkish extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	
	@Given("^Launh <\"([^\"]*)\"> Turkish$")
	public void launh_Turkish(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Click on From and To airport and select destinations$")
	public void click_on_From_and_To_airport_and_select_destinations() throws Throwable {
		homePageAction.ClickonFromandToairportandselectdestinations();
	}

	@Then("^Click on dates and select dates and add Passengers and Click Search Flights button$")
	public void click_on_dates_and_select_dates_and_add_Passengers_and_Click_Search_Flights_button() throws Throwable {
		homePageAction.ClickondatesandselectdatesandaddPassengersandClickSearchFlightsbutton();
	}



}
