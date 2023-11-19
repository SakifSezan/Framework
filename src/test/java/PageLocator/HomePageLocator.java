package PageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.BaseClass;

public class HomePageLocator extends BaseClass {
	
      public HomePageLocator() {
    	  PageFactory.initElements(driver, this);
    	  
      }
      @FindBy(xpath = "/html/body/div[1]/section/div/div[2]/div/div/div/nav[1]/ul/li[2]/a")
      public WebElement Aboutus;
      
      @FindBy(xpath = "/html/body/div[2]/div/div/p")
      public WebElement Verify;
      
      @FindBy(xpath = "/html/body/div[2]/section[2]/div/div[2]/div/div[2]/div/div/div/div/i")
      public WebElement Video;
      
      @FindBy(xpath = "/html/body/div[1]/div/div[4]/button")
      public WebElement PlayVideo;
      
      @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/ul/li[2]/a")
      public WebElement MouseHover;
      
      @FindBy(xpath = "//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
      public WebElement DropDown;

      @FindBy(xpath = "/html/body/main/div[1]/nav/div[2]/ul/li[1]/a")
      public WebElement Mouse;
      
      @FindBy(xpath = "/html/body/main/div[1]/nav/div[2]/ul/li[1]/div/a")
      public WebElement Drop;
      
      @FindBy(xpath = "//a[text()='Nexus 6']")
      public WebElement Scroll;
      
      @FindBy(xpath = "//button[text()='Apply Now']")
      public WebElement Apply;
      
      @FindBy(xpath ="/html/body/header/div[2]/div/div/section[3]/div/div/ul/li[2]/a")
      public WebElement Men;
      
      @FindBy(id ="searchInputId")
      public WebElement SearchBox;
      
      @FindBy(xpath = "/html/body/div[1]/main/header/div/div[1]/ul/li[3]/div/div/div/div/button")
      public WebElement Icon;
      
      @FindBy(xpath = "/html/body/div[1]/main/article/div[4]/div[3]/div/div[2]/div/div/section/div/div/div/div/div/ul/li[2]/div/a/div[2]")
      public WebElement VerifyMensShoes;
      
      @FindBy(xpath = "//a[text()=' Daily Deals']")
      public WebElement DailyDeals;
      
      @FindBy(xpath = "/html/body/main/div/div[1]/nav/ul/li[2]/a")
      public WebElement Tech;
      
      @FindBy(xpath = "/html/body/main/div/div[1]/nav/ul/li[1]/a")
      public WebElement Featured;
      
      @FindBy(xpath = "//a[text()='Cell Phones']")
      public WebElement Cellphone;
      
      @FindBy(xpath = "/html/body/main/div/div[1]/nav/ul/li[1]/div/div[2]/a[1]")
      public WebElement ShoeLace;
      
      @FindBy(xpath = "//span[text()='Cell Phones']")
      public WebElement EbayVerify;
      
      @FindBy(id = "gh-ac")
      public WebElement EbaySearch;
      
      @FindBy(id = "gh-btn")
      public WebElement SearchButton;
    
      @FindBy(xpath = "//span[text()='Lenovo ThinkPad X1 Carbon Gen 10 Intel Laptop, 14\" IPS, vPro®, 32GB, 512GB']")
      public WebElement LenovoLaptop;
      
      @FindBy(xpath = "/html/body/div[5]/div[4]/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/a/div/span")
      public WebElement iphone;
      
      //@FindBy(xpath = "/html/body/div[5]/div[4]/div[2]/div[1]/div[2]/ul/li[2]/div/div[2]/a/div/span")
      public WebElement Clicklaptop;
      
      @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/ul/li[2]/div/a/span/span")
      public WebElement AddToCartButton;
      
      //@FindBy(xpath = "/html/body/div[7]/div[2]/div[1]/div[4]/div/div/div[2]/div/div/div[6]/div[3]/div[2]/div[3]/div//div[2]/div[5]/div/button")
      public WebElement Proceed;
      
      @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/ul/li[2]/div/a")
      public WebElement AddToCart;
      
      @FindBy(xpath ="/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[5]/div[1]/div/div/div/div[1]/ul/li[2]/a/span")
      public WebElement Flights;
      
      @FindBy(xpath = "/html/body/div/div[2]/div[3]/div[3]/div[1]/div/div[1]/div/div[2]/a/button")
      public WebElement ApplyNow;
      
      @FindBy(xpath = "//div[contains(text(),'Sign in / Register')]")
      public WebElement Register;
      
      @FindBy(xpath = "//span[text()='Account']")
      public WebElement Account;
      
      @FindBy(xpath = "//a[text()='Create Account']")
      public WebElement CreateAccount;
      
      @FindBy(xpath = "//a[text()='Sign In']")
      public WebElement SignInButton;
      
      @FindBy(id = "gh-search-input")
      public WebElement SearchBoxBB;
      
      @FindBy(xpath = "/html/body/div[3]/div/div/div[1]/header/div[1]/div/div[1]/div/form/input[1]")
      public WebElement SearchIcon;
      
      @FindBy(xpath = "//a[text()='Order now']")
      public WebElement OrderNow;
      
      @FindBy(id = "onetrust-reject-all-handler")
      public WebElement Cookies;
      
      @FindBy(xpath = "//a[text()=' Brand Outlet']")
      public WebElement BrandOutlet;
      
      @FindBy(xpath = "//span[text()='Clothing']")
      public WebElement Clothing;
      
      @FindBy(xpath = "/html/body/div[4]/div[3]/div[1]/div/div/div/section[1]/ul/li[1]/ul/li[1]/a")
      public WebElement Champion;
      
      @FindBy(xpath = "//span[text()='Free Shipping']")
      public WebElement FreeShipping;
      
      @FindBy(xpath = "/html/body/div[6]")
      public WebElement Footer;
      
     @FindBy(xpath = "//span[text()='Computers & Accessories']")
     public WebElement Computers;
     
     @FindBy(xpath = "//button[text()='Laptops']")
     public WebElement Laptops;
      
     @FindBy(xpath = "//a[text()='Inspiron Laptops']")
     public WebElement Inspiron;
     
     @FindBy(xpath = "//a[text()='Buy']")
     public WebElement Buy;
     
     @FindBy(xpath = "/html/body/div[2]/div[2]/div[5]/div[3]/div[2]/div[2]/div/div[1]/fieldset/div/div[2]/label/span/span[1]/span")
     public WebElement ProMax;
     
     @FindBy(xpath = "/html/body/div[2]/div[2]/div[5]/div[3]/div[2]/div[2]/div/div[2]/fieldset/ul/li[2]/label/img")
     public WebElement BlueTitanium;
     
     @FindBy(xpath = "/html/body/div[2]/div[2]/div[5]/div[3]/div[2]/div[2]/div/div[3]/fieldset/div/div[3]/label/span")
     public WebElement Storage;
     
     @FindBy(id = "noTradeIn_label")
     public WebElement NoTradeIn;
     
     @FindBy(xpath = "/html/body/div[2]/div[2]/div[5]/div[3]/div[3]/div[2]/div/div/div/div[1]/div[2]/div/div/fieldset/div/div[1]/div/label")
     public WebElement BuyButton;
     
     @FindBy(xpath = "//span[text()='Connect to any carrier later']")
     public WebElement Carrier;
     
     @FindBy(id = "applecareplus_59_noapplecare_label")
     public WebElement NoCoverage;
     
     @FindBy(xpath = "/html/body/div[2]/div[2]/div[5]/div[3]/div[3]/div[10]/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/span/form/div/span/button")
     public WebElement AddToBag;
     
     @FindBy(xpath = "//button[text()='Review Bag']")
     public WebElement ReviewBag;
     
     @FindBy(id = "shoppingCart.actions.navCheckout")
     public WebElement Checkout;
     
     @FindBy(id = "signIn.guestLogin.guestLogin")
     public WebElement Guest;
     
     @FindBy(xpath = "//span[text()='Continue to Shipping Address']")
     public WebElement verifyShipping;
     
     @FindBy(xpath = "//span[contains(text(),'✕')]")
     public WebElement Close;
     
     @FindBy(id = "searchInput")
     public WebElement SearchBoxTemu;
     
     @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[4]/form/div/div[1]/svg")
     public WebElement SearchIconTemu;
     
     @FindBy(xpath = "//a[@title='Casual Shirts']")
     public WebElement CasualShirt;
     
     
     @FindBy(id = "LandingAirBookingSearchForm_originationAirportCode")
     public WebElement Depart;

     @FindBy(id = "LandingAirBookingSearchForm_destinationAirportCode")
     public WebElement Arrive;
     
     @FindBy(id = "LandingAirBookingSearchForm_departureDate")
     public WebElement DateOpen;
     
     @FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[4]/div/div/div/div/div[1]/div[1]/div/div[1]/div[10]/button[7]")
     public WebElement DateClick;
     
     @FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[4]/div/div/div/div/div[1]/div[1]/div/div[1]/div[10]/button[13]")
     public WebElement DateClick2;
     
     @FindBy(id = "passenger-selector--input")
     public WebElement Passenger;
     
     @FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/div[4]/div/div/div/div/div[1]/ul/li[1]/div[2]/div/button[2]/span[1]/span")
     public WebElement Add;
     
     @FindBy(id = "LandingAirBookingSearchForm_submit-button")
     public WebElement Search;
    
     @FindBy(id = "cookieWarningRejectId")
     public WebElement RejectCookie;
     
     @FindBy(id = "general-booker-from")
     public WebElement From;
    
     @FindBy(id = "general-booker-to")
     public WebElement To;
     
     @FindBy(xpath = "/html/body/div[1]/div/div[1]/section/div/div/div/div/div[2]/div[1]/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[4]/div[2]/div")
     public WebElement Date1;
     
     @FindBy(xpath = "/html/body/div[1]/div/div[1]/section/div/div/div/div/div[2]/div[1]/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div/div[2]/div[2]/div[2]/div[6]/div[4]/div")
     public WebElement Date2;
     
     @FindBy(xpath = "//span[text()='Passenger']")
     public WebElement PassengerButton;
     
     @FindBy(xpath = "/html/body/div[1]/div/div[1]/section/div/div/div/div/div[2]/div[1]/div[1]/div/div[3]/div/div/div/div/div[5]/div/div/div[1]/div/div/div[2]/span/a[2]")
     public WebElement AddButton;
     
     @FindBy(xpath = "//span[text()='Search flights']")
     public WebElement FlightsButton;
     
     @FindBy(xpath = "/html/body/div[2]/section[13]/div/div/div/div[4]/div/form/div/div[1]/input")
     public WebElement EmailField;
     
     @FindBy(xpath = "//span[text()='Send']")
 	public WebElement SendButton;
 	
 	@FindBy(xpath = "/html/body/div[2]/section[13]/div/div/div/div[4]/div/form/div[2]")
 	public WebElement Message;
 	
 	@FindBy(xpath = "//body/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
 	public WebElement AboutUsLink;
 	
 	@FindBy(xpath = "/html/body/div[1]/section/div/div[2]/div/div/div/nav[1]/ul/li[1]/a")
 	public WebElement HomeLink;
 	
 	@FindBy(id = "form-field-email")
 	public WebElement NextEmail;
 	
 	@FindBy(xpath = "//span[text()='Send']")
 	public WebElement SendKey;
 	
 	@FindBy(xpath = "//div[text()='Your submission was successful.']")
 	public WebElement SuccessMessage;
 	
 	
 	
 	
 	
 	
     
      
}
