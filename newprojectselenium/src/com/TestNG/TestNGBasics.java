package com.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGBasics {
	@BeforeSuite
	public void setUp() {
System.out.println("BeforeSuite--------------system properties for chrome");}
@BeforeClass
public void launchBrowser() {
	System.out.println("BeforeClass---------launch chrome browser");   }
@BeforeMethod
public void enterURL() {
	System.out.println("BeforeMethod-----------enterURL");                }
@BeforeTest
public void logIn() {
	System.out.println("BeforeTest---------logIn method");            }
@Test
public void googleTitleTest() {
	System.out.println("Test---------title method");            }
@Test
public void SearchTest() {
	System.out.println("Test----------search test");
}
@AfterMethod
public void Logout() {
	System.out.println("AfterMethod------log out method");          }
@AfterTest
public void deleteAllCookies() {
	System.out.println("AfterTest----------delete cookies");          }
@AfterClass
public void clearBrowser() {
	System.out.println("AfterClass--------clear browser");           }
@AfterSuite
public void generateTestReport() {
	System.out.println("AfterSuite----generate report");             }
}
