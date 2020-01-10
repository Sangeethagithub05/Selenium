package seleniumry;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/offers/quirky");
		WebElement snap=driver.findElement(By.xpath("//div[text()='Bronze Bat Double Finger Adjustable Ring- 1 Pc Fashion Jewellery']"));
		Thread.sleep(2000);
		Actions acc=new Actions(driver);
		acc.contextClick().perform();
	

}}
