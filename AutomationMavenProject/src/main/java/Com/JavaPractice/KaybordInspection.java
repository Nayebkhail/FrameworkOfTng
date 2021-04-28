package Com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KaybordInspection {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
        driver.manage().window().maximize();
  
        
        // How to write a code to enter any work in the search box and click the enter instead of clicking in the search icon
        WebElement searchbox=driver.findElement(By.name("field-keywords"));
        searchbox.sendKeys("Computer");
        
        // There is two way to use the keyword and select any keyboard like enter in this example
        //searchbox.sendKeys(Keys.ENTER);// First way
        
        Actions op=new Actions(driver);
        //op.sendKeys(searchbox, Keys.ENTER).perform(); //This is the second way that we can enter the word computer in the search box by using the send key method
        
        
        op.keyDown(Keys.CONTROL).sendKeys("a").build().perform();// This set of code is to select all the word computer in the amazon search box
        Thread.sleep(6000);
        op.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); // copy the the word 
        Thread.sleep(6000);
        searchbox.clear(); // clear the word computer form search box
        searchbox.click(); // clea
        Thread.sleep(6000);
        op.keyDown(Keys.CONTROL).sendKeys("v").build().perform();// paste the word computer in the search box
        

	}

}
