package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Driver78\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dcschoolhub.com/");
		Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/div[3]/div[2]/div/nav/div[1]/ul/li[1]/a"))).click().build().perform();
Thread.sleep(2000);
action.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/nav/div[3]/div[2]/div/nav/div[1]/ul/li[1]/ul/li[1]/a/a"))).click().build().perform();
Thread.sleep(2000);
		driver.findElement(By.linkText("MARYLAND IN-HOME CARE")).click();
	}
}
