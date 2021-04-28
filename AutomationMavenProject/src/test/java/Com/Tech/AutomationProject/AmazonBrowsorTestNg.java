package Com.Tech.AutomationProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AmazonBrowsorTestNg {
  WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("The before method bexecution start");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("The after method execution stopped");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  Thread.sleep(6000);
	  driver.quit();
  }
  @Test
  public void GiftCard() {
	  driver.findElement(By.linkText("Gift Cards")).click();
	  
	  
	  
	  
  }
  

}
