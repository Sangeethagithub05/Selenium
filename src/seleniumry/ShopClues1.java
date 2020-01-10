package seleniumry;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement mobbtn=driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(mobbtn).perform();
		Thread.sleep(2000);
		WebElement price=driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		price.click();
		
	

		
	
	

		

}}
