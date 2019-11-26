package sessionsselenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
//get the count of the links on the page and 2. is to get text of each link on the page.	
List <WebElement> linkList=	driver.findElements(By.tagName("a"));// we have to import list from ajava.util .ALSO LINK START WITH A HTML BY DEFAULT.
	//size of linklist
	System.out.println(linkList.size());
	for(int i=0;i<linkList.size();i++) {
		String LinkText= linkList.get(i).getText();
		System.out.println(LinkText);
	}}}
