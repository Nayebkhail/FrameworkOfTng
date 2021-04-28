package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Reusables {
  public WebDriver driver;
  @BeforeClass
  @Parameters({"URI","Wbsites"}) // (Video day 24) This annotation is used because the parameter from Function.xml should recognize the URI which is the  name of parameters
  public void browsers(String browsers,String Wbsite) { // The String wbsite is use here becuase we have declare it as parameter in the function class and we can use any wbsite when we change in function class,  
	   if(browsers.equalsIgnoreCase("Chrome")){ // this method helps to match string with string and if we wrongly call  the Chrom in lower case or upper case it will ignore the java sensitivity 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
			driver.get(Wbsite); // this wbsite is used here as value of URI and we declare this in the function class as parameter as well
			driver.manage().window().maximize();   
	   }else if (browsers.equalsIgnoreCase("firefox")) {
		 // we have to save the gecko driver under Driver folder
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get(Wbsite);
		 driver.manage().window().maximize();
	   }else if(browsers.equalsIgnoreCase("edge")) {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\msedgedriver.exe");
		   driver=new EdgeDriver();
		   driver.get(Wbsite);
		driver.manage().window().maximize();
	   }
	   
	  }
  

  @AfterClass
  public void afterClass() throws InterruptedException {
	Thread.sleep(6000);
	//driver.quit();
  }
  public void shots(String folder) throws IOException {
		 Date dt=new Date();// we have to select the ( import java.util.Date.)
		 System.out.println(dt);
		 String si=dt.toString().replace(" ", "_").replace(":", "_");// with this method we can change the format of date which is (int) to (string)and we use replace the colon sign  and space to underscore because string does not accept colon and space.
		 System.out.println(si);
		 File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// with TakesScreenshot we take the picture and with getScreenshotAs we specify the type of file and we need to select the file always.
		 FileHandler.copy(capture, new File("C:\\Users\\F\\git\\repository\\AutomationMavenProject\\Picture"+folder+"\\"+si+"Picture.png"));// With FileHandler method we chose the place where we physically sage the picture
	   }
  
}
