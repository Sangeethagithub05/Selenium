package seleniumry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Images {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(10000);
	WebElement close=driver.findElement(By.id("	transparentInner"));
	close.click();
	WebElement source=driver.findElement(By.id("credit2"));
	WebElement desti=driver.findElement(By.className("field14 ui-droppable ui-sortable"));
	Actions acc=new Actions(driver);
	acc.dragAndDrop(source, desti).perform();
	
	
}
}
