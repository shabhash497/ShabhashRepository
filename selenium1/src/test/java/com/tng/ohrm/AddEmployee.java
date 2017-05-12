package com.tng.ohrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddEmployee {
	WebDriver driver;
	@BeforeClass
  public void openApplication(){
	  System.setProperty("webdriver.chrome.driver","E:/Seleniumbrowserdrivers/chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
  }
  @AfterClass
  public void closeApplication(){
	  driver.quit();
  }
  @Test
  public void Login(){
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	  driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	  
  }
  @Test
  public void zddmmployee(){
	  driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();
	  driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
	  driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("selenium");
	  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("hq");		
	  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
  }
}
