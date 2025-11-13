package github;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class saucedemo_2 {
  private ChromeDriver driver;

  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions options = new ChromeOptions();

	  Map<String, Object> prefs = new HashMap<String, Object>();

	  prefs.put("credentials_enable_service", false);

	  prefs.put("profile.password_manager_enabled", false);

	  prefs.put("profile.password_manager_leak_detection", false);

	  options.setExperimentalOption("prefs", prefs);

	  driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
      
	  }
   @Test(priority=0)
   public void login() throws InterruptedException {
	   driver.navigate().refresh();
	   driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();		

	   
	   }
   @Test(priority=1)
   public void selectZtoA() throws InterruptedException {
	 
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
	   
	   String actual_message=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
       String expect_message="Test.allTheThings() T-Shirt (Red)";
       Assert.assertEquals(actual_message, expect_message);		

	    }
   @Test(priority=2)
   public void selectlowTohigh() throws InterruptedException {
	
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
	   
	   String actual_message=driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).getText();
       String expect_message="Sauce Labs Onesie";
       Assert.assertEquals(actual_message, expect_message);		

	    }
   @Test(priority=3)
   public void selecthighTolow() throws InterruptedException {
	  
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
	   
	   String actual_message=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
       String expect_message="Sauce Labs Fleece Jacket";
       Assert.assertEquals(actual_message, expect_message);	
   }
   @Test(priority=4)
   public void selecAtoZ() throws InterruptedException {
	
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).click();
	   
	   String actual_message=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
       String expect_message="Sauce Labs Backpack";
       Assert.assertEquals(actual_message, expect_message);	
   }
   @Test(priority=5)
   public void logout() throws InterruptedException {
	
	   driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
   }
   


   

  @AfterTest
  public void afterTest() {
  }

}
