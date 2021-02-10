package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage {
	
	WebDriver  driver;
	WebElement product;
	WebElement addToCart;
	WebElement korpa;
	

	public OrderPage(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getProduct() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/a/div"));
	}


	public WebElement getAddToCart() {
		return driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/button"));
	}


	public WebElement getKorpa() {
		return driver.findElement(By.id("shopping_cart_container"));
	}

	
}
