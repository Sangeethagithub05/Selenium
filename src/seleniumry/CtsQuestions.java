package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CtsQuestions {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	email.sendKeys("Sangeetha@gmail.com");
	WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("123");
	WebElement login=driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		login.click();
		
}
}
