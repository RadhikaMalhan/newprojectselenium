package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicesignupfordcshubsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.phptravels.org/register.php");
	driver.findElement(By.xpath("//*[@id=\"inputFirstName\"]")).sendKeys("Shreya");
	driver.findElement(By.xpath("/html/body/section[3]/div/div/div[3]/div/form/div[1]/div[2]/div[2]/div/input")).sendKeys("Rai");
	driver.findElement(By.xpath("/html/body/section[3]/div/div/div[3]/div/form/div[1]/div[2]/div[3]/div/input")).sendKeys("Rai124@rai.com");
	driver.findElement(By.xpath("/html/body/section[3]/div/div/div[3]/div/form/div[1]/div[2]/div[4]/div/div/input")).sendKeys("9653614405");
	driver.findElement(By.xpath("/html/body/section[3]/div/div/div[3]/div/form/p/input")).click();

	}

}
