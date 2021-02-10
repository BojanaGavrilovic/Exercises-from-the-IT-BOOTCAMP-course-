package test5tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/index.html");
		Thread.sleep(2000);
	}
	
	@Test (priority = 5)
	public void LogInTest ()  throws InterruptedException {
		
		pageLogIn.getUserName().sendKeys("standard_user");
		Thread.sleep(2000);
		pageLogIn.getPassword().sendKeys("secret_sauce");
		Thread.sleep(2000);
		pageLogIn.getButtonLogIn().click();
		Thread.sleep(2000);
		
		String text1 = pageLogIn.getConfirmationLabel().getText();
		Assert.assertEquals(text1, "ADD TO CART");
	}
	

	@Test (priority = 10)
	public void orderingTest () throws InterruptedException {
		
	LogInTest();
	pageOrder.getProduct().click();
	Thread.sleep(2000);
	pageOrder.getAddToCart().click();
	Thread.sleep(2000);
	pageOrder.getKorpa().click();
	Thread.sleep(2000);
	pageKorpa.getCheckOut().click();
	Thread.sleep(2000);
	pageInformation.getFirstName().sendKeys("Bolek");
	Thread.sleep(2000);
	pageInformation.getLastName().sendKeys("Gavril");
	Thread.sleep(2000);
	pageInformation.getPostalCode().sendKeys("21205");
	Thread.sleep(2000);
	pageInformation.getContiniue().click();
	Thread.sleep(2000);
	pageOverview.getFinish().click();
	Thread.sleep(2000);
	
	String text2 = pageFinish.getConfirmation().getText();
	Assert.assertEquals(text2, "THANK YOU FOR YOUR ORDER");
	
		
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
