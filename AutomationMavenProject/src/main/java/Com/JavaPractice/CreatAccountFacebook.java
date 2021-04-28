package Com.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatAccountFacebook {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
    driver= new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    
    WebElement creataccount=driver.findElement(By.xpath("//*[text()='Create New Account']"));
    creataccount.click();
    
    
    Thread.sleep(6000);
    WebElement Firstname=driver.findElement(By.xpath("//*[@name='firstname']"));
   Firstname.sendKeys("Mike");
    
    
   WebElement Lastname=driver.findElement(By.xpath("//*[@name='lastname']"));
   Lastname.sendKeys("Tyson");
   
   WebElement MobileNumber=driver.findElement(By.xpath("//*[@name='reg_email__']"));
   MobileNumber.sendKeys("9809809809");
   
   WebElement Password=driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
   Password.sendKeys("pmj");
   
   // in order to handle the dropdown we need to create the object of the dropdown which is class. then there is three was as following by index,ByValue and ByVisiabletext 
   
   WebElement yeardrop=driver.findElement(By.name("birthday_year"));
   
   Select ob=new Select(yeardrop);
   ob.selectByIndex(1);
   Thread.sleep(4000);
   ob.selectByValue("2018");
   Thread.sleep(4000);
   ob.selectByVisibleText("2014");
   
   // inspect the birthday dropdown in Facebook when you create new account
   Thread.sleep(4000);
   WebElement Birthdaydrop=driver.findElement(By.name("birthday_day"));
   Select os=new Select(Birthdaydrop);
   os.selectByIndex(5);
   
   
   // inspect the birthday month dropdown in Facebook when you create new account
   Thread.sleep(4000);
   WebElement Monthdrop=driver.findElement(By.name("birthday_month"));
   Select ow=new Select(Monthdrop);
   ow.selectByIndex(7);
    
   WebElement checkbox=driver.findElement(By.xpath("(//*[@class='_58mt'])[2]"));
   checkbox.click();
   
   WebElement signup=driver.findElement(By.xpath("//*[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
   signup.click();
   
    
   
    
    
    
    
    
    Thread.sleep(6000);
    driver.quit();
    
    
    
    
    
    
	}

}
