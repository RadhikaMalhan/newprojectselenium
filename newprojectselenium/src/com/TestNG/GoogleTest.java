package com.TestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class GoogleTest {
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
@Test(priority=1,groups="maillinkTest")
public void googleTitleTest() {
	String title=driver.getTitle();
	System.out.println(title);
}
@Test(priority=3,groups="test1")
public void logoTest() {
	boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
	System.out.println(b);
}
@Test(priority=2,groups="teardown")
public void maillinkTest() {
	boolean b1=driver.findElement(By.xpath("//a[contains(@class,'gb_g')]")).isDisplayed();
	System.out.println(b1);
}
@Test(priority=4,groups="googleTitleTest")
public void test1() {
	System.out.println("test1");
}
@AfterMethod
public void tearDown() {
	driver.quit();       }}
