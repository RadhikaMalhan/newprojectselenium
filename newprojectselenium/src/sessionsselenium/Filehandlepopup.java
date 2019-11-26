package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filehandlepopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/article/div/div[3]/form/input[1]")).sendKeys("C:\\Users\\Radhika\\Pictures\\SNIP.PNG");

	}

}
