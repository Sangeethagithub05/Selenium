package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	WebElement gmail=driver.findElement(By.xpath("//a[@role='button']"));
	gmail.click();
	WebElement gmail1=driver.findElement(By.xpath("//span[@style='background-position: 0 -2139px;']"));
	gmail1.click();
	
	
	
	}
}
