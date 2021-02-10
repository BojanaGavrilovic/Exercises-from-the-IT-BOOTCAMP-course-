package test5tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import test5pages.Finish;
import test5pages.KorpaPage;
import test5pages.LogInPage5;
import test5pages.OrderPage;
import test5pages.Overview;
import test5pages.YourInformation;

public class BaseTest {

	WebDriver driver;
	LogInPage5 pageLogIn;
	OrderPage pageOrder;
	YourInformation pageInformation;
	Overview pageOverview;
	Finish pageFinish;
	KorpaPage pageKorpa;
	
	
	@BeforeClass
	public void preKlase() throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.pageLogIn = new LogInPage5 (driver);
		this.pageOrder = new OrderPage(driver);
		this.pageInformation = new YourInformation(driver);
		this.pageOverview = new Overview (driver);
		this.pageFinish = new Finish(driver);
		this.pageKorpa = new KorpaPage(driver);
	
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void posleKlase() {
		driver.close();
	}

	
	
}
