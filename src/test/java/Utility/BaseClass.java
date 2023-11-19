package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static Properties Prop;
	
	public BaseClass() {
		try {
			FileInputStream File = new FileInputStream(System.getProperty("user.dir") + ("//src//test//java//Config//ConfigFile.properties"));
			Prop = new Properties(); 
			Prop.load(File);
		} catch (FileNotFoundException e) {
			System.out.println("Please look into the codes");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void Browser() {
		
		String AllBrowser = Prop.getProperty("Browser1");
		if(AllBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//ChromeDriver//chromedriver.exe"));
			ChromeOptions TX = new ChromeOptions();
			TX.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(UtilityClass.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(UtilityClass.implicitlyWait));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
		}
		else if(AllBrowser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+("//EdgeDriver//msedgedriver.exe"));
			EdgeOptions HTX = new EdgeOptions();
			HTX.addArguments("--remote-allow-origins=*");
		    driver = new EdgeDriver();
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(UtilityClass.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(UtilityClass.implicitlyWait));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		
		}
		
	}
	public static void LaunchURL(String URL) {
		
		driver.get(Prop.getProperty("URL1"));
		
	}
}	
				


	


