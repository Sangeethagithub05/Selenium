package seleniumry;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TNPSC {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("https://tspsconetimereg.tspsc.gov.in/oneTimeRegistration.tspsc");
	WebElement district=driver.findElement(By.id("nativeDistrict"));
	Select s=new Select(district);
	List<WebElement> element=s.getOptions();
	for(int i=0;i<element.size();i++)
	{
		WebElement wb=element.get(i);
		

	}
}
}
