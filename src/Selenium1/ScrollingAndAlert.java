package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingAndAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

// Selenium WebDriver- Scrolling a web page:-

		driver.get("https://www.javatpoint.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 13000)");

// Selenium WebDriver- Handling Alerts:-	

		driver.get("https://www.testandquiz.com/selenium/testing.html");

		// Handling alert boxes
		// Click on generate alert button
		driver.findElement(By.linkText("Generate Alert Box")).click();

		// Using Alert class to first switch to or focus to the alert box
		Alert alert = (Alert) driver.switchTo().alert();

		// Using accept() method to accept the alert box
		alert.accept();

		// Handling confirm box
		// Click on Generate Confirm Box
		driver.findElement(By.linkText("Generate Confirm Box")).click();

		Alert confirmBox = (Alert) driver.switchTo().alert();

		// Using dismiss() command to dismiss the confirm box
		// Similarly accept can be used to accept the confirm box
		((Alert) confirmBox).dismiss();

	}

}
