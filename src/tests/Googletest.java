package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {
	
	WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
  @Test (priority=1)
  public void Googletest() {
	  String title=driver.getTitle();  
	  System.out.println(title);
  }
  @Test(priority=2)
  public void logotest() {
	  boolean b=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	  
  }
  @Test(priority=3)
  public void linktest() {
	  boolean a=driver.findElement(By.linkText("Gmail")).isDisplayed();
  }
  
  @AfterMethod
  public void quit() {
	  driver.quit();
	  
  }
}
