package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Overview {
	
	
	
	WebDriver driver;
	WebElement finish;


	public Overview(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getFinish() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]"));
	}
}
