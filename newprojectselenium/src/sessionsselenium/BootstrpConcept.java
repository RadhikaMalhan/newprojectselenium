package sessionsselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BootstrpConcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Driver78\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        
        driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-info btn-sm dropdown-toggle')]")).click();
List <WebElement> Linklist=     driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu')]//li//label"));//where//li//label is list of labels
        System.out.println(Linklist.size());
        for(int i=1;i<=5;i++) {
       String str= 	Linklist.get(i).getText();
       if(str.contains("Bootstrap")) {
    	   Linklist.get(i).click();
    	   break;
       }
        }
         }}
