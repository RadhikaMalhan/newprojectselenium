package sessionsselenium;
      import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
      import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        public class JavascriptExecutorConcepts {
            public static void main(String[] args) throws IOException {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\Radhika\\Desktop\\chromey\\chromedriver.exe");
                WebDriver driver=new ChromeDriver();//launch chrome
                driver.manage().window().maximize();
                driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
                WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));//sign in button
                flash(loginBtn, driver);//highlight the element
                drawBorder(loginBtn,driver);
              //Take screenshot and save as file format
                File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                //NOW COPY TO DESIRED LOCATION
                FileUtils.copyFile(src,new File("C:\\Users\\Radhika\\Desktop\\newprojectselenium\\src\\sessionsselenium.png"));
            //---------------GENERATE ALERT--------------
            //generateAlert("this is an error with login button",driver);        
                clickElementByJS(loginBtn,driver);
              ScrollDownPage(driver);
             WebElement signLink= driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[1]/a"));
             ScrollIntoView(signLink,driver);
                }
            public static void flash(WebElement element, WebDriver driver) {
                JavascriptExecutor js = ((JavascriptExecutor)driver);
                String bgcolor = element.getCssValue("backgroundColor");
                for(int i=0;i<10;i++) {
                    changeColor("rgb(0,200,0)",element,driver);
                    changeColor(bgcolor,element,driver);
                }  }
            public static void  changeColor(String color, WebElement element, WebDriver driver) {
                JavascriptExecutor js = ((JavascriptExecutor)driver);
                js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
                try {  Thread.sleep(20);
                } catch (InterruptedException e) {          }    }
public static void drawBorder(WebElement element, WebDriver driver) {
    JavascriptExecutor js = ((JavascriptExecutor)driver);
   js.executeScript("arguments[0].style.border='3px solid red'", element);        }
public static void generateAlert(String message, WebDriver driver) {
	 JavascriptExecutor js = ((JavascriptExecutor)driver);
     js.executeScript("alert('"+ message +"')");                           
     }
public static void clickElementByJS(WebElement element, WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].click();", element); 
}
public static void ScrollDownPage(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
public static void ScrollIntoView(WebElement element, WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	   js.executeScript("arguments[0].scrollIntoView(true);", element); 
	
}
        }
        
        