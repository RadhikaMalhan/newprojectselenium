package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandledropboxValues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

driver.get("https://www.facebook.com/r.php");		

//Handle dropbox --- we have to create object of select class
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("22");
		
		
		
		
		
	}

}
