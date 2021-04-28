package Com.JavaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleNewWindow {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");	
	    driver=new ChromeDriver();
	    
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	}

}
