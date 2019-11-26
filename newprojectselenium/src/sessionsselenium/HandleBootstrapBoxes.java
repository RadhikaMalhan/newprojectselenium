package sessionsselenium;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleBootstrapBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Driver78\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        
        driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
        driver.findElement(By.id("dropdownMenuLink")).click();
        List <WebElement> list =driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')and @aria-labelledby='dropdownMenuLink']"));

       System.out.println(list.size());
       
       for(int i=0;i<list.size(); i++) {
           System.out.println(list.get(i).getText());
           if(list.get(i).getText().equals("Another action")) {
           list.get(i).click();
           break;
         }}}}
