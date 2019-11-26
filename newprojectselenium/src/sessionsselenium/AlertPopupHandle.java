package sessionsselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());// TO GET THE TEXT ON THE ALERT.
		String str=alert.getText();
		if(str.contentEquals("Please enter a valid user name")) {
			System.out.println("correct message");
		}
		else {
			System.out.println("in-correct message");
		}
		alert.accept();// click on Ok BUTTON.
		Thread.sleep(8000);
	}
}
