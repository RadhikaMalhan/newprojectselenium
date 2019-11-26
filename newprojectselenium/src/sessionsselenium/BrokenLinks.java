package sessionsselenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinks {
	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\Driver78\\chromedriver.exe");
WebDriver driver=new ChromeDriver();//launch chrome
driver.get("https://facebook.com");//enter URL		
driver.findElement(By.name("email")).sendKeys("yoxkifelpi_1548756535@tfbnw.net");
driver.findElement(By.name("pass")).sendKeys("blank@123");
Thread.sleep(3000);		
driver.findElement(By.linkText("Log In")).click();		
//1. get the list of all the links and images:
List <WebElement> linksList = driver.findElements(By.tagName("a"));
linksList.addAll(driver.findElements(By.tagName("img")));		
System.out.println("size of all links and images--->"+ linksList.size());
Thread.sleep(2000);
//active means having href property
List <WebElement> activeLinks = new ArrayList<WebElement>();		
//2. Iterate linksList: exclude all the links/images which doesn't have any href attribute
for(int i=0; i<linksList.size(); i++)             {
	System.out.println(linksList.get(i).getAttribute("href"));
	if(linksList.get(i).getAttribute("href") != null && (! linksList.get(i).getAttribute("href").contains("javascript"))) {
		activeLinks.add(linksList.get(i));			}}		
//3. get the size of active links list
System.out.println("size of active links and images--->"+ activeLinks.size());		
	//4. Check href URL with httpURLConnect URL
for(int j=0;j<activeLinks.size();j++) {
	HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();			
	connection.connect();
	String response = connection.getResponseMessage();//check if the url is correct or not
	connection.disconnect();
	System.out.println(activeLinks.get(j).getAttribute("href")+ "--->"+ response);       }}}
