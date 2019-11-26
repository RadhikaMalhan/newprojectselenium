package sessionsselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Driver78\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("window-size=1400,800");
		option.addArguments("headless");
        WebDriver driver = new ChromeDriver(option);//launch chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        
        driver.get("https://ui.cogmento.com/");
   System.out.println(driver.getTitle());

	}

}
