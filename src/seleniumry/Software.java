package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Software {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(2000);
		WebElement addbtn=driver.findElement(By.xpath("//button[@class='close']"));
		addbtn.click();
		WebElement course=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(course).perform();
		Thread.sleep(2000);
		WebElement software=driver.findElement(By.xpath("//span[text()='Software Testing Training ']"));
		acc.moveToElement(software).perform();
		Thread.sleep(2000);
		WebElement selenium=driver.findElement(By.xpath("//span[text()='Selenium Training']"));
		selenium.click();
		Thread.sleep(2000);
		WebElement addbtn1=driver.findElement(By.xpath("//button[@class='close']"));
		addbtn1.click();
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.xpath("//p[contains(text(),'Appium')]"));
		
		
		
		
		
		
		
		
		
		
		
				
	
	}
}
