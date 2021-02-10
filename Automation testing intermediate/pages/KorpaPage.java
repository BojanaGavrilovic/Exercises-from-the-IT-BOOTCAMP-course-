package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KorpaPage {
	
	WebDriver  driver;
	WebElement checkOut;
	
	public KorpaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCheckOut() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]"));
	}
}
