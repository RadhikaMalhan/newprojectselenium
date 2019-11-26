package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupforYahoo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com&specId=yidReg");
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/form/fieldset/div/div[1]/input")).sendKeys("Tester");
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/form/fieldset/div/div[2]/input")).sendKeys("Test");
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/form/div[1]/div[1]/input")).sendKeys("ttestet720yacom");
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/form/div[2]/input[1]")).sendKeys("Tsimoncowell");
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/form/div[3]/div[3]/input")).sendKeys("9653615509");
Select select=new Select(driver.findElement(By.id("usernamereg-month")));
select.selectByVisibleText("May");
driver.findElement(By.id("usernamereg-year")).sendKeys("1990");                                                                            
driver.findElement(By.id(("usernamereg-day"))).sendKeys("19");
driver.findElement(By.id("reg-submit-button")).click();
}

}