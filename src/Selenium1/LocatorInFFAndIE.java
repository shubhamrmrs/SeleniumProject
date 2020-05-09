package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatorInFFAndIE {
	public static void main(String[] args) {

		// Firefox:
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.linkText("Forgot your password?")).click();

		// InternetExplorer:
//	    System.setProperty("webdriver.ie.driver","C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\IEdriver\\IEDriverServer.exe"); 
//	    WebDriver driver = new InternetExplorerDriver();
//
//	    driver.get("https://opensource-demo.orangehrmlive.com/");
//        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPasswordX")).sendKeys("admin123");
//        driver.findElement(By.linkText("Forgot your password?")).click();
	}

}
//Success for Firefox!!