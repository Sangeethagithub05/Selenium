package seleniumry;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement txtbox=driver.findElement(By.id("inputValEnter"));
		txtbox.sendKeys("Hp Laptop");
		WebElement search=driver.findElement(By.className("searchformButton col-xs-4 rippleGrey"));
		search.click();
		Thread.sleep(200);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File temp=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\home\\Downloads\\HP Laptop.png");
		FileUtils.copyFile(temp, des);
		
}}
