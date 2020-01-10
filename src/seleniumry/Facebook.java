package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
	WebElement loc=driver.findElement(By.xpath("//a[contains(text(),'CONTACT US')]"));
	loc.click();
	WebElement loc1=driver.findElement(By.id("InputName"));
	loc1.sendKeys("Sangeetha");
	WebElement loc3=driver.findElement(By.id("InputEmail1"));
	loc3.sendKeys("Sangeetha@gmail.com");
	WebElement loc4=driver.findElement(By.id("InputSubject"));
	loc4.sendKeys("5872658299");
	Thread.sleep(1000);
	WebElement loc5=driver.findElement(By.xpath("//textarea[@name='comments'][1]"));
	loc5.sendKeys("Good");
	
	WebElement loc2=driver.findElement(By.id("submit"));
	loc2.click();
	
	//String txt=loc.getText();
	//System.out.println(txt);
	}

}
