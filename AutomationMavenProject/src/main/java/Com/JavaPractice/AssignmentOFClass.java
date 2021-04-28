package Com.JavaPractice;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOFClass {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.amazon.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //Thread.sleep(8000);
		  driver.get("https://dominos.com/");
		  WebElement onlinorder=driver.findElement(By.xpath("(//*[@class='qa-Cl_order js-orderOnlineNavigation action-ctas__icon--order-online c-site-nav-main-link-0'])[1]"));
		  onlinorder.click();
	
		
		
		
		
		

	}

}
