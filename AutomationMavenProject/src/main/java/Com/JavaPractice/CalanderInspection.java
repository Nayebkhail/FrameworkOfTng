package Com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderInspection {
static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.expedia.com/");
    driver.manage().window().maximize();
    
    // to select a date in the flight 
    Thread.sleep(6000);
    driver.findElement(By.id("d1-btn")).click();
    Thread.sleep(6000);
    driver.findElement(By.xpath("//*[@aria-label='Apr 26, 2021.']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
