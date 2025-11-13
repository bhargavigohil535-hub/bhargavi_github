package github;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Click {
	 private ChromeDriver driver;
 @BeforeTest
 public void beforeTest() {
	 driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get(" https://demoqa.com/buttons");
  }
  @Test
  public void f() throws InterruptedException {
	  Actions action = new Actions(driver);
	  WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/button"));
		action.doubleClick(element).perform();
		 String actual_message=driver.findElement(By.xpath("//*[@id=\"doubleClickMessage\"]")).getText();
	     String expect_message="You have done a double click";
	    		 Assert.assertEquals(actual_message, expect_message);
	    		 Thread.sleep(5000);
	     WebElement element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/button"));
	    action.contextClick(element1).perform();
	     String actual_message1=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/p[2]")).getText();
	     String expect_message1="You have done a right click";
	    		    		 Assert.assertEquals(actual_message, expect_message);
	    		 
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button")).click();
	     action.doubleClick(element).perform();
		 String actual_message2=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/p[2]")).getText();
	     String expect_message2="You have done a dynamic click";
	    		 Assert.assertEquals(actual_message, expect_message);
	    		 
 
  }
  @AfterTest
  public void afterTest() {
  }

}
