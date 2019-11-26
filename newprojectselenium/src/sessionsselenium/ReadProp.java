package sessionsselenium;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
public class ReadProp {
	static WebDriver driver;
			public static void main(String[] args) throws IOException {
				Properties prop=new Properties();
				
				FileInputStream ip=new FileInputStream("C:\\Users\\Radhika\\Desktop\\newprojectselenium\\src\\sessionsselenium\\config.properties");
				prop.load(ip);
			System.out.println(prop.getProperty("name"));
			String url= prop.getProperty("URL");
			System.out.println(url);
			String browsername= prop.getProperty("browser");
			System.out.println(browsername);
			
			if(browsername.equals("Chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
			 driver = new ChromeDriver();//launch driver
			}
			else if(browsername.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Radhika\\Desktop\\gecko\\geckodriver.exe");
			 driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.findElement(By.xpath(prop.getProperty("Firstname.xpath"))).sendKeys(prop.getProperty("Firstname"));
	
			driver.findElement(By.xpath(prop.getProperty("Emailaddress.xpath"))).sendKeys(prop.getProperty("Emailaddress"));
			
			}}