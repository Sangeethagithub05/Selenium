package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement fstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	fstname.sendKeys("Sangeetha");
	WebElement lstname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lstname.sendKeys("pv");
	WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	address.sendKeys("Taramani");
	WebElement emailadd=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	emailadd.sendKeys("sangeetha@gmail");
	WebElement phone=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	phone.sendKeys("9094169322");
	WebElement femalebtn=driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]"));
	femalebtn.click();
	WebElement hobbybtn=driver.findElement(By.id("checkbox1"));
	hobbybtn.click();
	
	
	
	
	
	
	
	
}

}
