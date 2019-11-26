package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();

driver.get("https://www.facebook.com/r.php");		

                                                             //.2 by id
                                                            //driver.findElement(By.id("u_0_n")).sendKeys("Tom");
                                                               //driver.findElement(By.id("u_0_p")).sendKeys("Tester");
	                                                                                                              //3.By name
//driver.findElement(By.name("firstname")).sendKeys("Tom");
//driver.findElement(By.name("lastname")).sendKeys("Tester");
//4.By linktext
//driver.findElement(By.linkText("Data Policy")).click();
driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Tom");
}

}
