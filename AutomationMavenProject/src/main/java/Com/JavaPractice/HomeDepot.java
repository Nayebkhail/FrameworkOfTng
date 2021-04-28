package Com.JavaPractice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        WebElement myaccoutn=driver.findElement(By.xpath("(//*[@class='MyAccount__label SimpleFlyout__link--bold'])[1]"));
        myaccoutn.click();
        Thread.sleep(6000);
        WebElement signin=driver.findElement(By.xpath("//*[text()=' Sign in ']"));
        signin.click();
        WebElement creatAccount=driver.findElement(By.xpath("//*[text()='Create an Account']"));
        creatAccount.click();
        WebElement selectaccoutn=driver.findElement(By.xpath("//*[text()='Select & Continue']"));
        selectaccoutn.click();
        Thread.sleep(3000);
        WebElement emailID=driver.findElement(By.id("email"));
        emailID.sendKeys("nay@gmail.com");
        Thread.sleep(6000);
        WebElement password=driver.findElement(By.id("password-input-field"));
        password.sendKeys("dog123");
        Thread.sleep(6000);
        WebElement zipcode=driver.findElement(By.id("zipCode"));
        zipcode.sendKeys("22304");
        Thread.sleep(3000);
        WebElement phone=driver.findElement(By.id("phone"));
        phone.sendKeys("7034709494");
        Thread.sleep(2000);
        WebElement keepmesignin=driver.findElement(By.xpath("(//*[@class='checkbox-btn__label-test u__text-align--left'])[1]"));
        keepmesignin.click();
        Thread.sleep(6000);
        
       
        WebElement Verify=driver.findElement(By.xpath("(//*[@class='checkbox-btn__label-test u__text-align--left'])[2]"));
        Verify.click();
        
        //The robot check box is not possible to inspect through selenium
        
       
        
        
        
        
        
        
        
        
        
        
        Thread.sleep(6000);
        driver.quit();
        
	}

}
