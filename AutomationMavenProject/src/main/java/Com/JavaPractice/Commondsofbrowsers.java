package Com.JavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commondsofbrowsers {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	
	// Two way to open a website
	
	//First way
	//driver.navigate().to("https://www.google.com/");
	
	//second way that we can open the website.

	driver.get("https://www.google.com/"); 
	
	 //To maximize the browser
	driver.manage().window().maximize();
	
	// This commend get you back one step
	driver.navigate().back();
	
	// By using this commend we give them same time to execute and the system throw us an expecepint handling message then we have to add the throws exception in the main method. 
	Thread.sleep(6000);
	
	
	// this commend get you one step forward
	driver.navigate().forward();
	
	
	
	// this commend refresh the browser
	driver.navigate().refresh();
	Thread.sleep(6000);
	
	
	// this commend close the browser after execution
	driver.close();
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	}

}
