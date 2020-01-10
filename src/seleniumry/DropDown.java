package seleniumry;

import java.awt.AWTException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement Ddmonth=driver.findElement(By.id("month"));
		Select s=new Select(Ddmonth);
		List<WebElement> li=s.getOptions();
		int size=li.size()-1;
		for(int i=size; i>size-5; i--)
			
		{
		WebElement element=li.get(i);
		
			
			
		}
		
		
		
		
	
		
			
		
		
		
		
		
			



		}}
