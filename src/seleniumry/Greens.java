package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement from=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("chennai");
		WebElement to=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		to.sendKeys("Banglore");
		
	}

}
