package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;

	File sourceFile;

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	
	public void takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);

		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String lable = formatter.format(date);
		
	try {
		FileUtils.copyFile(sourceFile,new File(System.getProperty("user.dir") + "/screenshots/" + lable + ".png"));

	} catch (IOException e) {
			e.printStackTrace();
		}

	}

	
	public static void validateElement(String errorMsg, String expected, String actual ) {
		Assert.assertEquals(errorMsg, expected, actual);
		
	}
	
	 public int generateRandomNum(int boundNum) {
		    Random rnd = new Random();
		    int generateNum = rnd.nextInt(boundNum);
			return generateNum;
			 }
	
	    
	 public static void validateDisplayElement(String msg, WebElement element) {
	        Assert.assertTrue(msg , element.isDisplayed());
	 }
	
	 public void waitForElement(WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }

	 public static void waitMethod() {
//			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
}
