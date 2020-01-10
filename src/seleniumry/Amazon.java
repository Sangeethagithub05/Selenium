package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			WebElement category=driver.findElement(By.id("nav-hamburger-menu"));
			category.click();
			WebElement mob=driver.findElement(By.xpath("(//a[@data-menu-id='7'])"));
			mob.click();
			WebElement powerbank=driver.findElement(By.xpath("//div[contains(text(),'Power')]"));
			powerbank.click();
			
			
			
		
}
}