package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserTest {

	public static void main(String[] args) {
		// Here WebDriver is a Interface and FirefoxDriver,ChromeDriver and
		// InternetExplorerDriver are the subclasses..

		// 1. Firefox DriverTest:
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\geckodriver\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver();
		 * driver.get("https://www.facebook.com");
		 */

		// 2 .InternetExplorer DriverTest:
		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\IEdriver\\IEDriverServer.exe"
		 * ); WebDriver driver = new InternetExplorerDriver(); // to load browser
		 * driver.get("https://www.selenium.dev/"); // to load URL
		 */

		// 3. Chrome DriverTest:

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		  driver.get("https://www.google.com/"); 
//		  driver.close();

		driver.get("https://www.javatpoint.com/");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/ul/li[11]/a")).click();
		
		
    	driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='gsc-i-id1']")).sendKeys("Andriod");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/table/tbody/tr/td/div[2]/div/div/div/form/table/tbody/tr/td[2]/button")).click();

//		  Select dd=new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/table/tbody/tr/td/div[2]/div/div/div/div[1]/div[4]/table/tbody/tr/td[2]/div/div[2]/div[1]/div[1]")));
//		  dd.selectByVisibleText("Date");

		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 * 
		 * if(title.equals("Google")) \\ validation
		 * {System.out.println("correct title");} else
		 * {System.out.println("incorrect title");}
		 * 
		 * System.out.println(driver.getCurrentUrl());
		 */}

}// Success!!
