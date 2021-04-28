package Com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBoxDisabled {
static WebDriver driver;
private static CharSequence computer;
	public static void main(String[] args) throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("https://www.amazon.com");
  driver.manage().window().maximize();
 // Thread.sleep(6000);
 // WebElement searchbox=driver.findElement(By.name("field-keywords"));
 // searchbox.sendKeys("computer");
  
  
//is displayed method is used to show if the search icon is displayed and  it print true in this example
  Thread.sleep(6000);
  //WebElement searchboxIcon=driver.findElement(By.id("nav-search-submit-button")); This is the correct element if run it, the word true will print in the console if we comment out the try and catch set of code
  
  
  
  // we used the try and catch method to print the " Element is not dispalayed
  try {
  WebElement searchIcon=driver.findElement(By.id("nav-search-submit-buttonui"));// here we I add ui at the end of element by attention to see if the system show the element is displayed in the console
  boolean displayed=searchIcon.isDisplayed(); 
  System.out.println(displayed);
  
  }catch (Exception e) {
	// TODO: handle exception
	  
  System.out.println("Element is not displayed");


  }

  
  
  
  
  Thread.sleep(6000);
  driver.quit();
  
  

	}

}
