package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage5 {
	
	WebDriver driver;
	WebElement userName;
	WebElement password;
	WebElement buttonLogIn;
	WebElement confirmationLabel;
	
	
	public LogInPage5(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserName() {
		return driver.findElement(By.id("user-name"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}

	public WebElement getButtonLogIn() {
		return driver.findElement(By.id("login-button"));
	}

	public WebElement getConfirmationLabel() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button"));
	}
	
	
	
	
	
}
