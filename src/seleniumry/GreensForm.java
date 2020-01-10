package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensForm{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement contactbox=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
	contactbox.click();
	WebElement name=driver.findElement(By.id("InputName"));
	name.sendKeys("Sangeetha");
	WebElement email=driver.findElement(By.id("InputEmail1"));
	email.sendKeys("Sangeetha@gmail.com");
	WebElement mobnum=driver.findElement(By.id("InputSubject"));
	mobnum.sendKeys("9094169322");
	WebElement message=driver.findElement(By.name("comments"));
	message.sendKeys("Good");
	
	
		
}
}
