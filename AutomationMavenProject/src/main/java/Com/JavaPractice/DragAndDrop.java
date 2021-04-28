package Com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        
        Actions ob=new Actions(driver); //we create the object to pertofrom or call the call the class
        
        
        driver.switchTo().frame(0);// we create this code because there was another  farm inside the frame 
        WebElement dragable=driver.findElement(By.id("draggable"));
        WebElement dropable=driver.findElement(By.id("droppable"));
        ob.dragAndDrop(dragable, dropable).build().perform();
        
        Thread.sleep(6000);
        driver.switchTo().parentFrame();
        WebElement resizable=driver.findElement(By.linkText("Resizable"));
        resizable.click();
        
       
        driver.switchTo().frame(0);// Again we should use this set of code to mover from parent class/frame to child/frame class 
        Thread.sleep(3000);
        WebElement resize=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        ob.dragAndDropBy(resize, 100, 200).perform(); // This code is to resize the frame 
        
        //Thread.sleep(6000);
        //driver.quit();
        
        
        

	}

}
