package AmazonRgressionSteps;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com.JavaPractice.Commondsofbrowsers;
import Come.pages.AmazonCreateAcc;
import Come.pages.Confirmation;
import Come.pages.CreatAmazonAccountTng;
import Come.pages.Home;
import Common.Reusables;

import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;// Library 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AmazonRegressionAscript extends Reusables {  // here we extends with Reusable class 
	
	
  @SuppressWarnings("deprecation")
@Test
  public void f() throws IOException {
	  
	  Home home=new Home(driver);
	  home.SignOverPointer();
	  home.signButtonClick();
	  shots(); // Here we write to take the screen shot and the method is in after class method
	  CreatAmazonAccountTng click=new CreatAmazonAccountTng(driver); // In here we have to create the object of the SignIn class if the class is in different package  we have to import the class as wel
	  click.ClickOnCreate(); // In here we have to call this method from CreatAmazonAccountTng class under Come.pages package to click in the creation of account
	  AmazonCreateAcc create=new AmazonCreateAcc(driver); // Here we create the object of AmazonCreateAcc class
	  create.CustomerField("Haroon");// these are the name of method from AmazonCreateAcc 
	  create.Email("Haroon@gmail.com");
	  shots();
	  create.pass("Haroon");
	  create.forgetpass("Haroon");
	  create.crAccount();
	  shots();
	  
	  Confirmation Confi=new Confirmation(driver); // Here we create the object of the Confirmation class in order to call the methods       
	  String submessage=Confi.submessage().getText();// ????????
	  System.out.println(submessage);
	  
	                                                 // The Assert method is used to verify and compare the expected message with the actual message which has existed in the element in the Confirmation class.
	                                                 // the problem of assert is that execution will stop as soon as the assertion field , So we have to use the SoftAssert and it will not stop the executing and the other test after that will work find and we can't see the assert filer. again we have to use the AssertAll method to see the failer. 
	  
	  //Assert.assertEquals(submessage, "You indicated you are a new customer, but an account already exists with the e-mail Haroon@gmail.com");      
	  SoftAssert softassert=new SoftAssert();// When we use SoftAssert we have to create the object of SoftAssert class as following.     
	  softassert.assertEquals(submessage, "You indicated you are a new customer, but an account already exists with the e-mail Haroon@gmail.com");// we can see the difference in this example when I change any of the following 
      System.out.println("This should print after assertion");
      softassert.assertAll();// We use the assertAll method to see the field part of execution. Because softAssert will not stop execution even if there is a problem and it will not show in the report and console as well.
      
      
	  
	  
	  //SignIn account=new SignIn(driver);
	  //account.EnterEmail();
	 // account.ClickContinue();
	  
  }
  @BeforeClass
  public void beforeClass() {
	browsers("Chrome", null);// here we can change the browser that we want to run our code on it like chrome, edge and firefox base on the code from the browser method that we create.
	  
	  /*
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		*/
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(6000);
	  //driver.quit();  
	
	  // We comment out the because we have these method in the reusable class and it has already extends with AmazonRegreationAscript class
  }/*
   public void browsers(String browsers) {
	   if(browsers.equalsIgnoreCase("Chrome")){ // this method helps to match string with string and if we wrongly call  the Chrom in lower case or upper case it will ignore the java sensitivity 
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();   
	   }else if (browsers.equalsIgnoreCase("firefox")) {
		 // we have to save the gecko driver under Driver folder
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.get("https://www.amazon.com/");
		 driver.manage().window().maximize();
	   }else if(browsers.equalsIgnoreCase("edge")) {
		   System.setProperty("webdriver.edge.driver", "C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Drivers\\msedgedriver.exe");
		   driver=new EdgeDriver();
		   driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	   }*/
	     
   
   public void shots() throws IOException {
	 Date dt=new Date();// we have to select the ( import java.util.Date.)
	 System.out.println(dt);
	 String si=dt.toString().replace(" ", "_").replace(":", "_");// with this method we can change the format of date which is (int) to (string)and we use replace the colon sign  and space to underscore because string does not accept colon and space.
	 System.out.println(si);
	 File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// with TakesScreenshot we take the picture and with getScreenshotAs we specify the type of file and we need to select the file always.
	 FileHandler.copy(capture, new File("C:\\Users\\F\\eclipse-workspace\\AutomationMavenProject\\Picture\\"+si+"Picture.png"));// With FileHandler method we chose the place where we physically sage the picture
   }
   
}
