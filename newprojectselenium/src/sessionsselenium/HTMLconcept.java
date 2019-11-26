package sessionsselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class HTMLconcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		// htmlUnitDriver is not available in Selenium3.x Version
		//htmlUnitDriver---- to use this concept we have to download jar file.
		//1. Execution of test cases is very fast//2. Testing is happening behind the scenes
		// notsuitable for actionClass---drag &drop,doubleClick.
		WebDriver driver =new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
		System.out.println("before login title is "+ driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(" yoxkifelpi_1548756535@tfbnw.net");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("blank@123");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println("after login title is "+ driver.getTitle());

	}
}
