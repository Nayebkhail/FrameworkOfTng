package Com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPasswordFacebook {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement EmailIDField=driver.findElement(By.id("email"));
		EmailIDField.sendKeys("7034702094");
		WebElement Password=driver.findElement(By.name("pass"));
		Password.sendKeys("sfjlkj");
		
		WebElement Forgot=driver.findElement(By.linkText("Forgot Password?"));
		Forgot.click();
		
		//WebElement EnterNumber=driver.findElement(By.id("identify_email"));
		//EnterNumber.sendKeys("7034702094");
		
		//WebElement Search=driver.findElement(By.id("did_submit"));
		//Search.click();
		
		// Absolute xpath we should make as following and we use when there is no any locator to make the xpath
		//WebElement cancel=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div/div/div/div/a"));
		//cancel.click();
		
		
		// how to use the text expath and as following we can print and we have to use the getText method to store the text in to veriable
		Thread.sleep(6000);
		WebElement title=driver.findElement(By.xpath("//div[text()='Please enter your email or phone number to search for your account.']"));
	    String tx=title.getText();
	    System.out.println(tx);
		Thread.sleep(6000);
		
		WebElement cancel=driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		cancel.click();
		
		Thread.sleep(6000);
	    driver.close();
		
		

	}

}