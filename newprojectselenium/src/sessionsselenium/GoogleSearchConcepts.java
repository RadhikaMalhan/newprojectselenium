package sessionsselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Driver78\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch chrome
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("test");
        
   List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='sbl1 sbl1p']//span"));
        
        System.out.println("total no. of suggestions===" + list.size());
            }
	}
