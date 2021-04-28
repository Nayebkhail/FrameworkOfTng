package AmazonRgressionSteps;

import org.testng.annotations.Test;

import Come.pages.HomeFaceBookPageObject;
import Common.Reusables;

import org.testng.annotations.DataProvider;

public class SingDataProvider extends Reusables {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException { // we should have the same number of value (john@gmail.com) as the number of arguments (n)
	  HomeFaceBookPageObject dr=new HomeFaceBookPageObject(driver);
	  dr.emailIdField(n);
	  dr.paswordIdField(s);
	  System.out.println("this to print the value for S"+s);
	  System.out.println("this to print the value for n"+n);
	  Thread.sleep(6000);
	  dr.loginField();
	  Thread.sleep(6000);
	  driver.navigate();
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "John@gmail.com", "black" }, // by default the first value would be int but we have to change to string as example
      new Object[] { "f@gmail.com", "Silver" },
      new Object[] { "John@gmail.com", "black" }, // by default the first value would be int but we have to change to string as example
      new Object[] { "f@gmail.com", "Silver" },
      new Object[] { "John@gmail.com", "black" }, // by default the first value would be int but we have to change to string as example
      new Object[] { "f@gmail.com", "Silver" },
    };
  }
}
