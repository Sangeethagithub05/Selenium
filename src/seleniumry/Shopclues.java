package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement sportsbtn=driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(sportsbtn).perform();
		Thread.sleep(2000);
		WebElement weightgrainerbtn=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		weightgrainerbtn.click();
		Thread.sleep(3000);
		WebElement weight=driver.findElement(By.id("det_img_106045043"));
		weight.click();
		

		
		
	}
	
	
}
