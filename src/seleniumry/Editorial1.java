package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editorial1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gettyimages.in/editorial-images");
		WebElement edit=driver.findElement(By.xpath("(//a[@data-nav='nav_Editorial'])"));
		edit.click();
		WebElement entertainment=driver.findElement(By.xpath("//a[text()='Entertainment']"));
		entertainment.click();
		
	
	}
}
