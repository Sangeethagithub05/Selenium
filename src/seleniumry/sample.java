package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class sample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement close=driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]"));
	close.click();
	driver.manage().window().maximize();
	
WebElement home=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
Actions acc=new Actions(driver);
acc.moveToElement(home).perform();

WebElement chair = driver.findElement(By.xpath("//a[text()='Dining Tables & Chairs']"));
chair.click();
WebElement chairModel = driver.findElement(By.xpath("//a[text()='Flipkart Perfect Homes Luzon Metal 4 Seater Dining Set']"));
chairModel.click();
driver.quit();





	}
}
