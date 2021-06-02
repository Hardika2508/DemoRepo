package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class yahoologintest {
	WebDriver driver;
	
@Test
@Parameters({"url","Emailid"})
public void login(String url,String Emailid) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
 driver=new FirefoxDriver();
driver.get(url);

driver.findElement(By.id("login-username")).sendKeys(Emailid);

Thread.sleep(2000);
driver.findElement(By.name("signin")).click();
	
}
	

}
