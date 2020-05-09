package Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\IEdriver\\IEDriverServer.exe"); 
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://way2automation.com");
        
        

	}

}
