package github;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class verify_title {
	private ChromeDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/");
		
		   }
  @Test
  public void verifytitele() {
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Welcome: Mercury Tours";
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  

  @AfterTest
  public void afterTest() {
  }

}
