package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Finish {

	WebDriver driver;
	WebElement confirmation;
	
	public Finish(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getConfirmation() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/h2"));
	}


	
	
	
	
}
