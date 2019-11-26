package sessionsselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationBack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.ebay.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
			Thread.sleep(3000);
		

	}

}
