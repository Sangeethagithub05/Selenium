package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sqa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement fstname=driver.findElement(By.name("firstname"));
		fstname.sendKeys("Sangeetha");
		WebElement lstname=driver.findElement(By.id("lastname"));
		lstname.sendKeys("pv");
		Thread.sleep(10000);
		WebElement addclose=driver.findElement(By.xpath("//img[@class='lazyloading']"));
		addclose.click();
		WebElement femalebtn=driver.findElement(By.xpath("//input[@value='Female']"));
		femalebtn.click();
		WebElement expbtn=driver.findElement(By.id("exp-4"));
		expbtn.click();
	WebElement datebox=driver.findElement(By.id("datepicker"));
		datebox.sendKeys("12/21/2019");
		WebElement profession=driver.findElement(By.id("profession-1"));
		profession.click();
	
		
	
		
		
		
		
	}

}
