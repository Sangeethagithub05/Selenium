package seleniumry;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\seleniumry\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File temp=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);
		File desc=new File("C:\\Users\\home\\Downloads\\FB Screenshot.png");
		FileUtils.copyFile(temp, desc);
		
		
		
		
		
		
		}

}
