package Com.JavaPractice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		// How to inspect moreover elements
		WebElement signin=driver.findElement(By.xpath("//*[text()='Hello, Sign in']"));
		Actions ob=new Actions(driver);
		ob.moveToElement(signin).build().perform();
		WebElement orders=driver.findElement(By.linkText("Orders"));
		
		// With the following two way we can click on an element after mouse over action
		ob.moveToElement(orders).click().build().perform();
		//orders.click();
		
		
		
		

	}

}
