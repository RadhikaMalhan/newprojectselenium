package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);// to move from outer to inner window.
		//how to perform drag and drop
		Actions action=new Actions(driver);
action.clickAndHold(driver.findElement(By.xpath("/html/body/div[1]"))).moveToElement(driver.findElement(By.xpath("/html/body/div[2]")))
.release().build().perform();
	}

}
