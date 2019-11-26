package sessionsselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webdriverbasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//Launch Chrome

		driver.get("https://www.google.com");//enter URL
		String title = driver.getTitle();
		System.out.println(title);
		//validation point
		if(title.contentEquals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("in-correct title");
		}
		System.out.println(driver.getCurrentUrl());
	}
}
