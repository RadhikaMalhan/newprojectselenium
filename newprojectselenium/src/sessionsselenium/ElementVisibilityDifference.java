package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityDifference {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//launch chrome
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php");
//1.IsDisplayed()----------Applicable for all elements
       boolean b1= driver.findElement(By.xpath("//*[@id=\"u_0_14\"]")).isDisplayed();
       System.out.println(b1);
 //2.IsEnabled()
       boolean b2= driver.findElement(By.xpath("//*[@id=\"u_0_14\"]")).isEnabled();
       System.out.println(b2);
 //3. IsSelected--------------only for drop down,checkbox,radiobutton
       boolean b3= driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).isSelected();
       System.out.println(b3);
	}

}
