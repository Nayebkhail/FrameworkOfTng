package Com.JavaPractice;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Iterators;

public class OpenWindowInNewTab {
static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.amazon.com");
		  driver.manage().window().maximize();
		
		  // By using this code we want to open the kindle Books in the new tab
		WebElement bookkindle=driver.findElement(By.linkText("Kindle Books"));
		
		// We use this set of code to get the window session Id form parent window
		String parentwindowhandle=driver.getWindowHandle();
		System.out.println(parentwindowhandle);
		
		Actions ob=new Actions(driver);
		
		// The keyDown method used here to act like we press the shift key when we want to open the new tap manually
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		bookkindle.click();
		// The KeyUp method is used to release the shift key back 
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();
		
		
		// Here we have to use the set<string> because the primitive data type can accept only one value and here the  string can,t take multiple value which (windowHandles)
		// we stored the windows in the windowhandles
		Set<String> windowhandles=driver.getWindowHandles();
		
		//Iterator
		Iterator<String> iterate=windowhandles.iterator();
		String FirstwindowHandle=iterate.next();
		String SecondWindowHandle=iterate.next();
		driver.switchTo().window(SecondWindowHandle);
		System.out.println(FirstwindowHandle);
		System.out.println(SecondWindowHandle);
		
		// Note: The code from line 43 up to line 51 are for switch window handling
		
		
		//Second Window
		WebElement Amazonchart=driver.findElement(By.linkText("Amazon Charts"));
		Amazonchart.click();
		
		
		
		
	}

}
