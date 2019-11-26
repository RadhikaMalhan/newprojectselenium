package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupforFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");	
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("Simon");
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Cowell");
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div/form/div[1]/div[2]/div/div[1]/input")).sendKeys("Cowell@gmail.com");
driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div/form/div[1]/div[5]/div/div[1]/input")).sendKeys("Cowell123");
driver.findElement(By.linkText("Terms")).click();
driver.findElement(By.linkText("Data Policy")).click();
driver.findElement(By.linkText("Cookie Policy")).click();
Select select=new Select(driver.findElement(By.id("day")));
select.selectByVisibleText("22");
Select select1=new Select(driver.findElement(By.id("month")));
select1.selectByVisibleText("Apr");
Select select2=new Select(driver.findElement(By.id("year")));
select2.selectByVisibleText("2015");
}
}