package Com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlertHandeling {
public static RemoteWebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        
        WebElement simpleTestAlert=driver.findElement(By.id("alertButton"));
		simpleTestAlert.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(7000);
		WebElement TimeAlert=driver.findElement(By.id("timerAlertButton"));
		TimeAlert.click();
        
		// to accept the pop up alert
		Thread.sleep(8000);
		driver.switchTo().alert().accept();
		
		
		WebElement ConfirmAlert=driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[3]"));
		ConfirmAlert.click();
		
		
		// To cancel the pop up alert
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		
		
		WebElement writename=driver.findElement(By.id("promtButton"));
		writename.click();
		Thread.sleep(6000);
		driver.switchTo().alert().sendKeys("haroon");
		
		
		
		
		
		
	}

}
