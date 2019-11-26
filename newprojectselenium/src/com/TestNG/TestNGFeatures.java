package com.TestNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
@Test
public void LogInTest() {
	System.out.println("login page");
	int i=9/0;
}
@Test(dependsOnMethods="LogInTest")// as if login won't work how any thing will happen
public void HomepageTest() {
	System.out.println("home page");	
}
@Test(dependsOnMethods="LogInTest")
public void RegistrationTest() {
	System.out.println("registration page");
}
}
