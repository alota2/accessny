package accessny;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;


public class navigation {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","/home/lesly/Downloads/selenium/chromedriver");
	  System.setProperty("webdriver.firefox.marionette", "/home/lesly/Downloads/selenium/geckodriver");
			WebDriver driver = new ChromeDriver();
	  
	  //WebDriver driver = new FirefoxDriver();
	
			String baseUrl = "https://access.nyc.gov/";	  
			
			Thread.sleep(1000);

	      // launch Fire fox and direct it to the Base URL
			
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get(baseUrl);
	      driver.manage().window().maximize();
	      
	      Thread.sleep(1000);
	      
	     // driver.findElement(By.linkText("Am I eligible?")).click();
	     // driver.findElement(By.className("logo-access")).click();
	      
	      
	      
	      driver.findElement(By.xpath("//a[.='Programs']")).click();
	      
	      driver.navigate().back();
	      
	      driver.findElement(By.xpath("//a[.='Locations']")).click();
	      
	      driver.navigate().back();
	      
	     // driver.findElement(By.xpath("//a[.='Search']")).click();
	      
	      driver.findElement(By.id("icon-ui-search")).click();
	      
	      driver.findElement(By.id("icon-ui-x")).click();
	      
	      //driver.navigate().back();
	        
	      //driver.findElement(By.linkText("Continue")).click();
  }
}
