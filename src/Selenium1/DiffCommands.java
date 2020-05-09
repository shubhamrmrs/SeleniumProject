package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiffCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubhamrmrs\\eclipse-swing-workspace\\SeleniumProject\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("javatpoint");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[3]/center/input[1]")).click();

//		 Browser Commands:-
		
//	     String Title = driver.getTitle();                           //Get Title Command
//		 System.out.println(Title);
//		 
//		 int titleLength = driver.getTitle().length();               //Title length
//		 System.out.println(titleLength);
//		 
//		 String CurrentUrl =driver.getCurrentUrl();                  //Get Current URL Command 
//		 System.out.println(CurrentUrl);
//		 
//		 String PageSource = driver.getPageSource();                  //Get Page Source Command 
//    	 System.out.println(PageSource);
//	
//		 driver.close();                                              //Close Command
//	 
//    	 driver.quit();                                               //Quit Command
		
		
//		 Navigation Commands:-
		
		 driver.navigate().to("https://www.javatpoint.com");          //to(String arg0) = this method loads a new web page in the existing browser window
   	     driver.navigate().back();                              
    	 driver.navigate().forward();
    	 driver.navigate().refresh();
    	 
//    	 WebElement Commands:-  The term web element refers to a HTML element.
    	 
    	 WebElement element = driver.findElement(By.id("UserName"));  //	Here, the UserName is the value of the id attribute
    	 element.clear();
    	 //Or can be written as  
    	 driver.findElement(By.id("UserName")).clear();  
    	 
    	 // Similar way..
    	 element.sendKeys("");
    	 element.isDisplayed();
    	 element.isEnabled();
    	 element.isSelected();                
    	 element.submit();
    	 element.getText();
    	 element.getTagName();
    	 element.getCssValue("");
    	 element.click();
    	 element.getLocation();
    	 element.getSize();
    	
       }

}
//Success!!