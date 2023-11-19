package StepDefinition;

import PageAction.HomePageAction;
import PageAction.SearchPageAction;
import Utility.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ChickFilA extends BaseClass {
	
	HomePageAction homePageAction = new HomePageAction();
	SearchPageAction searchPageAction = new SearchPageAction(); 
	
	@Given("^Launh <\"([^\"]*)\"> Chick-fil-A$")
	public void launh_Chick_fil_A(String URL) throws Throwable {
		LaunchURL(URL);
	}

	@Then("^Click Order Now button$")
	public void click_Order_Now_button() throws Throwable {
		homePageAction.ClickonOrderNowbutton();
	
	}

	@Then("^Click Pickup button and Search address and click Find Restaurant button$")
	public void click_Pickup_button_and_Search_address_and_click_Find_Restaurant_button() throws Throwable {
		searchPageAction.ClickPickupbuttonandSearchaddressandclickFindRestaurantbutton();
	}

	@Then("^Click Select this restaurant and click Drive-thru$")
	public void click_Select_this_restaurant_and_click_Drive_thru() throws Throwable {
		searchPageAction.ClickSelectthisrestaurantandclickDrivethru();
	}
	@Then("^Click on Meals and click on Honey Pepper meal and click Next button$")
	public void click_on_Meals_and_click_on_Honey_Pepper_meal_and_click_Next_button() throws Throwable {
		searchPageAction.ClickonMealsandclickonHoneyPeppermealandclickNextbutton();
	}

	@Then("^Click on waffle fries and click Next and select Diet Lemonade and click Review meal button and click add to order button$")
	public void click_on_waffle_fries_and_click_Next_and_select_Diet_Lemonade_and_click_Review_meal_button_and_click_add_to_order_button() throws Throwable {
		searchPageAction.ClickonwafflefriesandclickNextandselectDietLemonadeandclickReviewmealbuttonandclickaddtoorderbutton();
	}

	@Then("^Click on My Order button and click Checkout button and click Signin button$")
	public void click_on_My_Order_button_and_click_Checkout_button_and_click_Signin_button() throws Throwable {
		searchPageAction.ClickonMyOrderbuttonandclickCheckoutbuttonandclickSigninbutton();
	}

	@Then("^Verify user can add items in cart and order food$")
	public void verify_user_can_add_items_in_cart_and_order_food() throws Throwable {
		searchPageAction.Verifyusercanadditemsincartandorderfood();
	}




}
