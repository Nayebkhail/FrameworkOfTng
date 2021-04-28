package AmazonRgressionSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Come.pages.Home;
import Come.pages.HomeFaceBookPageObject;
import Common.Reusables;

public class FabookSignThroughPropertiesFile extends Reusables {
  @Test //(groups = {"functional"}) // In order to use the grouping we have to use this code in front of @Test and we should make the grouping tag in the function xml file
  public void f() throws InterruptedException, IOException { // we should have the same number of value (john@gmail.com) as the number of arguments (n)
	  HomeFaceBookPageObject dr=new HomeFaceBookPageObject(driver);
	 Properties prop=new Properties();// java.utils helps us to get any value from properties file
	  FileInputStream ds=new FileInputStream("C:\\Users\\F\\git\\repository\\AutomationMavenProject\\src\\Amazon.properties");// this code is helping to get the data and storing the date and help the find the location of the file
	  prop.load(ds); // we have to call the constructor object 
	  String id=prop.getProperty("Email");
	  String st=prop.getProperty("Psswd");
	  System.out.println(id);
	  System.out.println(st);
	  dr.emailIdField(id);
	  dr.paswordIdField(st);
	  //System.out.println("this to print the value for S"+s);
	  //System.out.println("this to print the value for n"+n);
	  Thread.sleep(6000);
	  dr.loginField();
	  Thread.sleep(6000);
	  //driver.navigate();
	  
	  Home ob=new Home(driver); // object of the home class for printing how many links available in the facebook page
	  ob.findlinks();
	  
	  
	  
	  // when we use grouping we should uncomment the following methods and also the argument from @test in the above as well as the group tag in the function file
	  
  }
  @Test(groups = {"Regression"}) // This grouping is used to excute the different test like regression, Smoke, etc
  public void Regression() {
	  System.out.println("This to execute regression group");
  }
  @Test(groups = {"Adhock"})// This grouping is used to excute the different test like regression, Smoke, etc
  public void Adhock() {
	  System.out.println("This to execute Adhock");
	  
  
  }
  
  }
