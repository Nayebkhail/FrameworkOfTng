package Com.JavaPractice;

import java.awt.event.WindowEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationFacebook {
	static WebDriver driver;
	private static String String;
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement EmailIDFields=driver.findElement(By.id("email"));
		EmailIDFields.sendKeys("7034702094");
		WebElement Pasword=driver.findElement(By.id("pass"));
		Pasword.sendKeys("2345");
		WebElement forgot=driver.findElement(By.partialLinkText("Forgot Password?"));
		forgot.click();
		//WebElement search=driver.findElement(By.xpath(""/html/body));
		
		Thread.sleep(6000);
		WebElement title=driver.findElement(By.xpath("//div[text()='Please enter your email or phone number to search for your account.']"));
		String=title.getText();
		System.out.println("//div[text()='Please enter your email or phone number to search for your account.']");
		
		Thread.sleep(6000);
		WebElement cancel=driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		cancel.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
