package Com.Tech.AutomationProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationExecutionSteps {
  @Test
  public void f() {// 5
	  System.out.println("This to execute test annotation");  
  }
  @BeforeMethod
  public void beforeMethod() {//4
	  System.out.println("This to execute before method annotation");
  }

  @AfterMethod
  public void afterMethod() {//6
	  System.out.println("This to execute afther method annotation");
  }

  @BeforeClass
  public void beforeClass() {//3
	  System.out.println("This to execute before class annotation");
  }

  @AfterClass
  public void afterClass() {//7
	  System.out.println("This to execute afther class annotation");
  }

  @BeforeTest
  public void beforeTest() {//2
	  System.out.println("This to execute before test annotation");
  }

  @AfterTest
  public void afterTest() {//8
	  System.out.println("This to execute after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {// 1
	  System.out.println("This to execute before Suite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This to execute after Suite annotation");
  }

}
