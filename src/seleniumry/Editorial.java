package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Editorial {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src=driver.findElement(By.id("credit2"));
		WebElement Desti=driver.findElement(By.id("bank"));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(src, Desti).perform();
		WebElement src1=driver.findElement(By.id("fourth"));
		WebElement Desti1=driver.findElement(By.id("amt7"));
		acc.dragAndDrop(src1, Desti1).perform();	
		WebElement src2=driver.findElement(By.id("credit1"));
		WebElement Desti2=driver.findElement(By.id("loan"));
		acc.dragAndDrop(src2, Desti2).perform();
		WebElement src3=driver.findElement(By.id("fourth"));
		WebElement Desti3=driver.findElement(By.id("amt8"));
		acc.dragAndDrop(src3, Desti3).perform();
		
			
		
		
	}

}
