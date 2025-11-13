package github;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class saucedemo {
	public WebDriver driver;
	
	
	@BeforeTest
	  public void beforeTest() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
	  }
  @Test(priority=0)
  
  public void bothvalueblank() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(5000);
      String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
      String expect_message="Epic sadface: Username is required";
      Assert.assertEquals(actual_message, expect_message);		

      }
   @Test(priority=1)
   public void usernameblank() throws InterruptedException {
	
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	   driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	   Thread.sleep(5000);
       String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
       String expect_message="Epic sadface: Username is required";
       Assert.assertEquals(actual_message, expect_message);		

	 }
   @Test(priority=2)
  public void passwordblank() throws InterruptedException {
	   
	  driver.navigate().refresh();
	  driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	  Thread.sleep(5000);
      String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
      String expect_message="Epic sadface: Password is required";
      Assert.assertEquals(actual_message, expect_message);		

	 }
   @Test(priority=3)
    public void invalidusername() throws InterruptedException {
	   
	 driver.navigate().refresh();
	 driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Bhargavi");
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 Thread.sleep(5000);
     String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
     String expect_message="Epic sadface: Username and password do not match any user in this service";
     Assert.assertEquals(actual_message, expect_message);	
		
     }
  @Test(priority=4)
    public void invalidpassword() throws InterruptedException {
	  
	 driver.navigate().refresh();
	 driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Siddhi");
	 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 Thread.sleep(5000);
     String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
     String expect_message="Epic sadface: Username and password do not match any user in this service";
     Assert.assertEquals(actual_message, expect_message);	
		
     }
   @Test(priority=5)
    public void bothvalueinvalid() throws InterruptedException {
	   driver.navigate().refresh();
	   driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Bhargavi");
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Siddhi");
	   driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	   Thread.sleep(5000);
       String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
       String expect_message="Epic sadface: Username and password do not match any user in this service";
       Assert.assertEquals(actual_message, expect_message);	
		
        }
   @Test(priority=6)
    public void specialorjunkcharecter() throws InterruptedException {
 	   driver.navigate().refresh();
 	   driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("b&$>#");
 	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("si*^$kl");
 	   driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
 	   Thread.sleep(5000);
       String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
       String expect_message="Epic sadface: Username and password do not match any user in this service";
       Assert.assertEquals(actual_message, expect_message);	
 		
         }
   @Test(priority=7)
    public void casesensitive() throws InterruptedException {
 	   driver.navigate().refresh();
 	   driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Standard_user");
 	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Secret_sauce");
 	   driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
 	   Thread.sleep(5000);
       String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
       String expect_message="Epic sadface: Username and password do not match any user in this service";
       Assert.assertEquals(actual_message, expect_message);	
 		
         }
   @Test(priority=8)
    public void trim() throws InterruptedException {
	   driver.navigate().refresh();
	   driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("  standard_user ");
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("   secret_sauce ");
	   driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	   Thread.sleep(5000);
       String actual_message=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
       String expect_message="Epic sadface: Username and password do not match any user in this service";
       Assert.assertEquals(actual_message, expect_message);	
		
         }
  @Test(priority=9)
   public void validvalue() throws InterruptedException {
	   driver.navigate().refresh();
	   driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	   driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        }
 
 @AfterTest
  public void afterTest() {
  }

}
 