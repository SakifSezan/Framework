package PageAction;

import org.testng.Assert;

import PageLocator.SearchPageLocator;
import Utility.BaseClass;
import Utility.TestDataClass;
import Utility.UtilityClass;

public class SearchPageAction extends BaseClass {
	
	SearchPageLocator searchPageLocator = new SearchPageLocator();
	
	public void ClickPickupbuttonandSearchaddressandclickFindRestaurantbutton() {
		searchPageLocator.PickUp.click();
		searchPageLocator.Houston.sendKeys(TestDataClass.Zip);
		searchPageLocator.FindRestaurant.click();	
	}
	public void ClickSelectthisrestaurantandclickDrivethru() throws Exception {
		searchPageLocator.SelectThisRestaurant.click();
		searchPageLocator.CarryOut.click();
		//Thread.sleep(3000);
		//searchPageLocator.DriveThru.click();
	}
	public void ClickonMealsandclickonHoneyPeppermealandclickNextbutton() throws Exception {
		searchPageLocator.Meals.click();
		//Thread.sleep(2000);
		searchPageLocator.HoneyPepper.click();
		searchPageLocator.NextButton.click();
	}
	public void ClickonwafflefriesandclickNextandselectDietLemonadeandclickReviewmealbuttonandclickaddtoorderbutton() throws Exception {
		searchPageLocator.Fries.click();
		searchPageLocator.Beverage.click();
		searchPageLocator.DietLemonade.click();
		searchPageLocator.Review.click();
		searchPageLocator.AddOrder.click();
		
	}
	public void ClickonMyOrderbuttonandclickCheckoutbuttonandclickSigninbutton() {
		searchPageLocator.MyOrderButton.click();
		searchPageLocator.CheckOutButton.click();
		searchPageLocator.SignInButton.click();
	}
	public void Verifyusercanadditemsincartandorderfood() throws Exception {
		boolean SigninVefify = searchPageLocator.SigninVerfy.isDisplayed();
		Thread.sleep(2000);
		System.out.println("Test Is Successfull");
		Assert.assertTrue(SigninVefify);
		UtilityClass.takeMyScreenshot(driver, "Sign in Pass");
	}


}
