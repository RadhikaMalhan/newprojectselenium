package com.TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class GoogleTitleTest {
	WebDriver driver;
@BeforeMethod
public void setUp() {
	System.out.println("system properties");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
}
@Test
public void googleTitleTest() {
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Google","title is not matched");
}
@Test
public void logoTest() {
	boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
	System.out.println(b);
	Assert.assertTrue(b);
	}
@AfterMethod
public void tearDown() {
	driver.quit();  }}