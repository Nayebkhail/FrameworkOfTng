package Com.JavaPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitwait {
static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");	
    driver=new ChromeDriver();
    
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    
    //The implicitlywait is used to wait if there is not any such element in the locator but the program is searching for the time which we give it for example here is 100 second
    //but if the element is correct it will not wait for that specific time and show the result
   
    
    //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    //driver.findElement(By.id("twotabsearchtextbox")).click(); 
    
    WebDriverWait ob= new WebDriverWait(driver, 20);// when ever we want to use the function of the class we should create object of the class
    
    
    // The explicitly wait is professional used for the wait and the function is like implicitlywait but the code is different and it wait for specific time if the element is not exisit in the lotator
    ob.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox"))).click();
    
    
    
    
    
    
    
    
	}

}