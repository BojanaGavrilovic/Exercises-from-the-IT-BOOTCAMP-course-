package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourInformation {

	WebDriver driver;
	WebElement firstName;
	WebElement lastName;
	WebElement postalCode;
	WebElement continiue;
	
	public YourInformation(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}


	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}


	public WebElement getPostalCode() {
		return driver.findElement(By.id("postal-code"));
	}


	public WebElement getContiniue() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input"));
	}
}
