package seleniumry;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement alertokbtn=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertokbtn.click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		WebElement okcancelbtn=driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		okcancelbtn.click();
		WebElement okcancelbtn2=driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		okcancelbtn2.click();
		Alert b=driver.switchTo().alert();
		Thread.sleep(3000);
		b.dismiss();
		WebElement okcancelbtn3=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		okcancelbtn3.click();
		WebElement okcancelbtn4=driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		okcancelbtn4.click();
		Alert c=driver.switchTo().alert();
		Thread.sleep(3000);
		c.sendKeys("sangee");
		Thread.sleep(3000);
		c.accept();
		

}}
