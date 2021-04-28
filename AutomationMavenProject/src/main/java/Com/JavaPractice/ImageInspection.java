package Com.JavaPractice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ImageInspection {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver= new ChromeDriver();
	
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        
        Actions ob=new Actions(driver); // we should select the java action 
        
        Thread.sleep(6000);
        // How to inspect the picture first:
        // first we have to right click on the picture and then click on product info then mouse over to the installation and then right click on how to setup and select the inspect
        WebElement Picture=driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
        Thread.sleep(3000);
        ob.contextClick(Picture).build().perform(); // we have to use the contextclick method to call inspect the picture.
        
        // Any time when we use action object we need to use the build.pertorm method
        
        
        
        
        
        
        
        
        
	}

}
