package PageAction;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import PageLocator.HomePageLocator;
import Utility.BaseClass;
import Utility.TestDataClass;
import Utility.UtilityClass;

public class HomePageAction extends BaseClass {
	
	HomePageLocator homePageLocator = new HomePageLocator();
	
	public void ClickAboutuslink() {
		homePageLocator.Aboutus.click();
		
	}
	public void VerifyusercanclickAboutuslink() throws Exception {
		boolean AboutusPageVerification = homePageLocator.Verify.isDisplayed();
		Thread.sleep(3000);
		Assert.assertTrue(AboutusPageVerification);	
	}
    public void Playthevideo() {
		homePageLocator.Video.click();
		
	}
	public void Clickthevideo() {
		homePageLocator.PlayVideo.click();
	}
	public void MousehovertoAcademicslink() {
		Actions AC = new Actions(driver);
		AC.moveToElement(driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/a"))).build().perform();
	}
	public void ClickonLibrarypage() {
		homePageLocator.DropDown.click();
		
		
		//Select SL = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")));
		//SL.selectByVisibleText("Library");
		
	}
	public void MousehovertoDesktoplink() {
		homePageLocator.Mouse.click();
		
	}
	public void DropdowntoShowAllCatagory() {
		Select SL = new Select(driver.findElement(By.xpath("/html/body/main/div[1]/nav/div[2]/ul/li[1]/div/a")));
		SL.selectByVisibleText("Show All Desktops");
		
	}
	public void Scrolldownthewebpage() throws Exception {
	((JavascriptExecutor)driver).executeScript("scroll(0,9000)");
	Thread.sleep(2000);
	((JavascriptExecutor)driver).executeScript("scroll(-0,1000)");
		
	//homePageLocator.Apply.click();
	
	}
	public void MousehovertoMoretravelslink() {
		Select sl = new Select(driver.findElement(By.xpath("//div[text()='More travel']")));
		//sl.selectByVisibleText("Cars");
		
	}
	public void MousehovertoMenlink() {
		Actions AC = new Actions(driver);
		AC.moveToElement(homePageLocator.Men).build().perform();
		
	}
	public void TypeMensColognclicksearchicon() {
		homePageLocator.SearchBox.sendKeys(TestDataClass.Searchbox);
		homePageLocator.Icon.click();
		
	}
	public void Verifyusercansearchitemsinsearchbox() throws Exception {
		boolean MensShoesVefify = homePageLocator.VerifyMensShoes.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(MensShoesVefify);
		System.out.println("User can search Succsessfully");
		UtilityClass.takeMyScreenshot(driver, "Seach Page");
	}
	public void ClickonDailyDeals() {
		homePageLocator.DailyDeals.click();
	}
	public void MousehovertoTechs() {
		Actions ac = new Actions(driver);
		ac.moveToElement(homePageLocator.Tech).build().perform();
		
		
	}
	public void ClickCellphones() {
		homePageLocator.Cellphone.click();
	}
	public void Verifyusercandropdownonebay() throws Exception {
		boolean verify = homePageLocator.EbayVerify.isDisplayed();
		Thread.sleep(2000);
		System.out.println("Verified");
		Assert.assertTrue(verify);
		UtilityClass.takeMyScreenshot(driver, "ebay");
	}
	public void SearchLaptopsinsearchbox() {
		//homePageLocator.EbaySearch.sendKeys(TestDataClass.Search);
		homePageLocator.EbaySearch.sendKeys(TestDataClass.Search2);
		homePageLocator.SearchButton.click();
		
	}
	public void AddLenovoThinkpadX1inthecart() throws Exception {
		//homePageLocator.LenovoLaptop.click();
		homePageLocator.iphone.click();
		Set<String> allwindow = driver.getWindowHandles();
	    Iterator<String> WIN = allwindow.iterator();
	   
	    String parentwindow = WIN.next();
	    String childwindow = WIN.next();
	    
	    driver.switchTo().window(childwindow);
	    System.out.println("This is the Child Window");
	    homePageLocator.Clicklaptop.click();
	}
	public void ClickAddtoCartbuttonandProceedtoCheckout() throws Exception {
		  homePageLocator.AddToCart.click();
		//Thread.sleep(1000);
		//homePageLocator.Proceed.click();
		
		homePageLocator.AddToCart.click();
		
	}
	public void ClickApplyNowbutton() {
		homePageLocator.ApplyNow.click();
		
	}
	public void ClickonSignupRegisterlink() {
		homePageLocator.Register.click();
		
	}
	public void ClickonAccountlink() {
		homePageLocator.Account.click();
	}
	public void ClickCreateAccountbutton() {
		homePageLocator.CreateAccount.click();
	}
	public void ClickonAccountbutton() {
		homePageLocator.Account.click();
	}
	public void ClickSigninbutton() {
		homePageLocator.SignInButton.click();
	}
	public void SearchMacbookProinthesearchboxandclicksearchicon() {
		homePageLocator.SearchBoxBB.sendKeys(TestDataClass.BB_Search);
		homePageLocator.SearchIcon.click();
	}
	public void ClickonOrderNowbutton() {
		homePageLocator.OrderNow.click();
		//homePageLocator.Cookies.click();
		
	}
	public void ClickonBrandoutletlinkandsclickonClothinglink() {
		homePageLocator.BrandOutlet.click();
		homePageLocator.Clothing.click();
		
	}
	public void SelectChampionlinkandScrolldownthepage() throws Exception {
		homePageLocator.Champion.click();
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		boolean ShippingVerify = homePageLocator.FreeShipping.isDisplayed();
		Thread.sleep(1000);
		Assert.assertTrue(ShippingVerify);
		System.out.println("Free Shipping is Present in Web page");
		UtilityClass.takeMyScreenshot(driver, "Free Shipping");
	}
	public void SelectFreeShippingboxandScrolldowntothebottomofthepage() throws Exception {
		homePageLocator.FreeShipping.click();
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,3000)");
		boolean FooterVerify = homePageLocator.Footer.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(FooterVerify);
		UtilityClass.takeMyScreenshot(driver, "Footer");
	}
	public void Scrolldownthewebpagetillsupport() throws Exception {
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,9000)");
		
	}
	public void  MousehovertoComputerslinkanddropdowntoLaptops() throws Exception {
		Actions AC = new Actions(driver);
		AC.moveToElement(homePageLocator.Computers).build().perform();
		Thread.sleep(1000);
		Actions Ac = new Actions(driver);
		Ac.moveToElement(homePageLocator.Laptops).build().perform();
		
	}
	public void TheselectXPSLaptops() throws Exception {
		Thread.sleep(1000);
		homePageLocator.Inspiron.click();
	}
	public void  ClickonBuybuttonandScrolldownthepageandclickon15promaxlinkandchooseBlueTitaniumcolor() throws Exception {
		homePageLocator.Buy.click();
		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		Thread.sleep(1000);
		homePageLocator.ProMax.click();
		Thread.sleep(1000);
		homePageLocator.BlueTitanium.click();
		
	}
	public void ScrolldownthepageandClickon1TBlinkselectNoTradeinbuttonandclickonBuybutton() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,1100)");
		Thread.sleep(2000);
		homePageLocator.Storage.click();
		Thread.sleep(2000);
		homePageLocator.NoTradeIn.click();
		homePageLocator.BuyButton.click();
		
	}
	public void ClickonConnecttoCarrierLaterbuttonandclickonNocoveragelink() throws Exception {
		Thread.sleep(2000);
		homePageLocator.Carrier.click();
		Thread.sleep(2000);
		homePageLocator.NoCoverage.click();
	}
	public void ScrolldownandclickonAddtobagbuttonandclickonReviewbagandclickCheckoutbuttonandclickContinueasGuestbutton() throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");	
		Thread.sleep(2000);
		homePageLocator.AddToBag.click();
		Thread.sleep(2000);
		homePageLocator.ReviewBag.click();
		Thread.sleep(2000);
		homePageLocator.Checkout.click();
		Thread.sleep(2000);
		homePageLocator.Guest.click();
	}
	public void Verifyusercanbuyaniphone15promax() throws Exception {
		boolean VerifyAddress = homePageLocator.verifyShipping.isDisplayed();
		Thread.sleep(2000);
		Assert.assertTrue(VerifyAddress);
		UtilityClass.takeMyScreenshot(driver, "Apple");
	}
	
	
	public void SearchMonitorLightbarinthesearchboxandclickonSearchicon() {
		homePageLocator.SearchBoxTemu.sendKeys(TestDataClass.Light);
		homePageLocator.SearchBoxTemu.click();
		
		
		
		
	}
	public void SelecDepartandArrivaldestinations() throws Exception {
		homePageLocator.Depart.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
		homePageLocator.Depart.sendKeys(TestDataClass.Depart);
		homePageLocator.Arrive.sendKeys(TestDataClass.Arrive);
		homePageLocator.Arrive.sendKeys(Keys.ENTER);	
	}
	public void Selectdatesandselectpassengers() throws Exception {
		
		//JavascriptExecutor TX = (JavascriptExecutor)driver;
		//TX.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value= '10/15/2023'");
		//TX.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value= '10/20/2023'");
		homePageLocator.DateOpen.click();
		homePageLocator.DateClick.click();
		Thread.sleep(1000);
		homePageLocator.DateClick2.click();
		
		Thread.sleep(2000);
		homePageLocator.Passenger.click();
		homePageLocator.Add.click();
		//TX.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value= '10/30/2023'");
		
	}
	public void ClickonSearchbutton() {
		homePageLocator.Search.click();
	}
	public void ClickonFromandToairportandselectdestinations() {
		homePageLocator.RejectCookie.click();
		homePageLocator.To.sendKeys(TestDataClass.To);
		
		homePageLocator.To.sendKeys(Keys.ARROW_DOWN);
		homePageLocator.To.sendKeys(Keys.ENTER);
			
	}
	public void ClickondatesandselectdatesandaddPassengersandClickSearchFlightsbutton() {
		homePageLocator.Date1.click();
		homePageLocator.Date2.click();
		
		homePageLocator.PassengerButton.click();
		homePageLocator.AddButton.click();
		
		homePageLocator.FlightsButton.click();
	}
	public void ScrolldowntoSubscribetonewsletter(String E) throws Exception {
		Thread.sleep(1000);
		homePageLocator.EmailField.sendKeys(E);
		homePageLocator.SendButton.click();
	}
	public void VerifyLearnMorebuttonisdisplaying() throws Exception {
 boolean VerifyMessage = homePageLocator.Message.isDisplayed();
 Thread.sleep(1000);
 Assert.assertTrue(VerifyMessage);
 UtilityClass.takeMyScreenshot(driver, "Message");
	}
	public void ClickonAboutuslinkandclickonHomelinkagain() throws Exception {
		homePageLocator.AboutUsLink.click();
		Thread.sleep(1000);
		homePageLocator.HomeLink.click();
	}
	public void VerifyusecanclickHomelinkandseeHomepage() throws Exception {
		 boolean VerifyHomePage = homePageLocator.HomeLink.isDisplayed();
		 Thread.sleep(1000);
		 Assert.assertTrue(VerifyHomePage);
		 UtilityClass.takeMyScreenshot(driver, "HomePage");
	}
	public void ScrolldowntillSTNLEnterEmailadressandclickSendbutton(String E) throws Exception {
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		Thread.sleep(1000);
		homePageLocator.NextEmail.sendKeys(E);
		Thread.sleep(1000);
		homePageLocator.SendKey.click();
		Thread.sleep(1000);
		UtilityClass.takeMyScreenshot(driver, "Success Message");
	}
	public void VerifySuccessmessageisdisplayingaftersentwithemail() throws Exception {
		boolean VefifyMessage = homePageLocator.SuccessMessage.isDisplayed();
		Thread.sleep(1000);
		Assert.assertTrue(VefifyMessage);
		UtilityClass.takeMyScreenshot(driver, "Success Message");
	}
	
		
}


		
	
		
		

		
	

