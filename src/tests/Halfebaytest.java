package tests;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Halfebaytest {
	
WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		System.setProperty("webdriver.gecko.driver","D:\\QA\\seleniumjars\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.getharvest.com/signup");
	}
	
	@DataProvider
	public Iterator<Object[]>gettestdata(){
		ArrayList<Object[]> testdata=Testutill.getdatafromexcel();
		return testdata.iterator();
		
	}
	
	@Test(dataProvider="gettestdata")
	public void createaccount(String Firstname,String Lastname,String Email,String Password) {
		driver.findElement(By.id("signup_first_name")).sendKeys(Firstname);
		driver.findElement(By.id("signup_last_name")).sendKeys(Lastname);
		driver.findElement(By.id("signup_email")).sendKeys(Email);
		driver.findElement(By.id("signup_password")).sendKeys(Password);
		driver.findElement(By.name("commit")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}

