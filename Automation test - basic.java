package Domaci21012021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		//elements
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]/span")).click();
		//text box
		
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).clear();
		//obrisi full name
		
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Bojana Gavrilovic");
		//unese ime
		
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("bojanatojaga@gmail.com");
		//unese email
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span")).click();
		//check box
		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
		//strelica drop down lista
		
		driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]")).click();
		//selektovan desktop
		
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]")).click();
		//zatvara listu elementa
		
		Thread.sleep(5000);
		
		driver.close();
	}

}


/*Napisati program koji:
•	Ocitava stranicu https://demoqa.com/ (inace stranica je namenjena za automatsko testiranje i 
odlicna je za pocetak pa mozete ako zelite proci kroz sve delove stranice)
•	Klikne na "Elements"
•	Klikne na "Text Box"
•	Polje "Full name" ocisti pa unese vase ime - 
ciscenje se radi tako sto napisete ime elementa kako ste ga nazvali i
 dodate .clear() na primer za element username bi bilo username.clear();
•	U polje "Email" unesite vas email
•	Kliknete na "Check Box"
•	Kliknete na strelicu da se spusti dropdown lista (levo od "Home" dugme)
•	Selektujete samo "Desktop"
•	Kliknete ponovo na "Elements" da se zatvori spisak
•	Na kraju stavite sleep 5 sekundi i zatvorite program*/

