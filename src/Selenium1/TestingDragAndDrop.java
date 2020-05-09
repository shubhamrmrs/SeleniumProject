package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestingDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//			  
//	         driver.get("https://www.facebook.com");
//           driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9669361344");
//           driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("sks@12345");
//           driver.findElement(By.xpath("//*[@id='u_0_b']")).click();

		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.id("fname")).sendKeys("javatpoint");                       // TextBox
		driver.findElement(By.xpath("//*[@id='male']")).click();                         // radio button
		// int a = driver.findElements(By.xpath("//*[@id='group']")).size();
		// System.out.println(a);
		driver.findElement(By.xpath("/html/body/div/div[8]/div/form/input[1]")).click(); // checkBox

		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));      // Drop-down
		dropdown.selectByVisibleText("Database Testing");

		WebElement from = driver.findElement(By.id("sourceImage"));                      // Drag and drop
		WebElement to = driver.findElement(By.id("targetDiv"));

		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
	}

}
//Success except Drag and drop!!
