package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebtableConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Driver78\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();//launch chrome
        driver.manage().window().maximize();
        driver.get("http://dev.softprodigy.in/Dcschool/wp-login.php");
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("DCschoolHUB");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("$zh*BaZnv#oX1@1#");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
        
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Contact')]"))).click().build().perform();
        driver.findElement(By.linkText("Contact Forms")).click();
        Thread.sleep(2000);
      //*[@id="the-list"]/tr[1]/td[1]/strong/a
      //*[@id="the-list"]/tr[2]/td[1]/strong/a
      //*[@id="the-list"]/tr[3]/td[1]/strong/a
        
        String before_xpath="//*[@id=\"the-list\"]/tr[";
        String after_xpath="]/td[1]/strong/a";
        for(int i=1; i<=3; i++) {
            String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
            System.out.println(name);
            if(name.equals("Contact form")) {
            	//*[@id="the-list"]/tr[1]/th/input
            	//*[@id="the-list"]/tr[2]/th/input
                
                System.out.println("test");
                driver.findElement(By.xpath("//*[@id=\"the-list\"]/tr[" + i + "]/th/input")).click();
                System.out.println("testing");
        }
                
        }}}
