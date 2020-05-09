package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsInChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\chrome\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
		  //driver.get("https://opensource-demo.orangehrmlive.com/");
		  // driver.close();
		  
         //1. id:
         //driver.findElement(By.id("txtUsername")).sendKeys("Admin");        
         //driver.findElement(By.id("txtPassword")).sendKeys("admin123");
         
         //2. name:
         //driver.findElement(By.name("txtPassword")).sendKeys("admin123");

         //3. ClassName many times class name won't be unique
         
         //4. Xpath:
//           driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
//           driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		  
         //5. CSS:
         //driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
         //driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
         
         //6. linkText:
         //  driver.findElement(By.linkText("Forgot your password?")).click();
          
         //7. partialLinkText:
         // driver.findElement(By.partialLinkText("Forgot your")).click();
         
         //8. TagName:
         //driver.findElement(By.tagName("img"));
         //System.out.println(driver.findElements(By.tagName("img")).size());
         
			/*
			 * NOTE: Direct locator(Static) = id,name,ClassName. 
			 * Dynamic = Xpath,CSS(important).
			 */
         
	      // facebook sign-up:
		  
		  driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236063%7Ce%7Cfacebook%7C&placement=&creative=318504236063&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066387003%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D9061994%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw-Mr0BRDyARIsAKEFbefos4hgbmFwY_xtt30eGPJ7JRr27LZA-kFaDxHtTrS-RiPYMB8Av6AaAlnzEALw_wcB");
          driver.findElement(By.xpath("//*[@id='u_0_n']")).sendKeys("shubham");
          driver.findElement(By.xpath("//*[@id='u_0_p']")).sendKeys("sinha");
          driver.findElement(By.xpath("//*[@id='u_0_s']")).sendKeys("8770312852");
          driver.findElement(By.xpath("//*[@id='u_0_x']")).sendKeys("sks345"); 
          driver.findElement(By.xpath("//*[@id='day']")).sendKeys("03"); 
          
          Select selectday = new Select(driver.findElement(By.id("day")));  // Here Select is class : drop-down feature
          selectday.selectByVisibleText("3");
          
          Select selectmonth = new Select(driver.findElement(By.id("month")));
          selectmonth.selectByVisibleText("Feb");
          
          Select selectyear = new Select(driver.findElement(By.id("year")));
          selectyear.selectByVisibleText("1997");
          
          driver.findElement(By.id("u_0_7")).click();
          
          JavascriptExecutor js = (JavascriptExecutor) driver;                //Scrolling
  		  js.executeScript("scrollBy(0, 3000)"); 
         
          driver.findElement(By.name("websubmit")).click();
          
		  
		  // facebook login:
		  
//		    driver.get("https://www.facebook.com");
//          driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9669361344");
//          driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("s#1513");
//          driver.findElement(By.xpath("//*[@id='u_0_b']")).click();

	}

}
//Success!!


