package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSlectTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Driver78\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//launch chrome
        driver.manage().window().maximize();
  driver.get("https://ui.freecrm.com/");
        
        driver.findElement(By.name("email")).sendKeys("sukhwinder_101291@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("ravinder");
        Thread.sleep(3000);
} 
		}