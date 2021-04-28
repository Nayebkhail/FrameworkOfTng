package AmazonRgressionSteps;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import Common.Reusables;



public class Listner extends Reusables implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
  System.out.println("Test is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
   System.out.println("Faild");
   this.driver = ((Reusables)result.getInstance()).driver;
   Date dt=new Date();// we have to select the ( import java.util.Date.)
	 System.out.println(dt);
	 String si=dt.toString().replace(" ", "_").replace(":", "_");// with this method we can change the format of date which is (int) to (string)and we use replace the colon sign  and space to underscore because string does not accept colon and space.
	 System.out.println(si);
	 File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// with TakesScreenshot we take the picture and with getScreenshotAs we specify the type of file and we need to select the file always.
	 try {
		FileHandler.copy(capture, new File("C:\\Users\\F\\git\\repository\\AutomationMavenProject\\Picture\\Passed\\"+si+"picture.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}// With FileHandler method we chose the place where we physically sage the picture
	}

	@Override
	public void onTestFailure(ITestResult result) {
	this.driver = ((Reusables)result.getInstance()).driver;
	System.out.println("Faild");
	   this.driver = ((Reusables)result.getInstance()).driver;
	   Date dt=new Date();// we have to select the ( import java.util.Date.)
		 System.out.println(dt);
		 String si=dt.toString().replace(" ", "_").replace(":", "_");// with this method we can change the format of date which is (int) to (string)and we use replace the colon sign  and space to underscore because string does not accept colon and space.
		 System.out.println(si);
		 File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// with TakesScreenshot we take the picture and with getScreenshotAs we specify the type of file and we need to select the file always.
		 try {
			FileHandler.copy(capture, new File("C:\\Users\\F\\git\\repository\\AutomationMavenProject\\Picture\\Faild\\"+si+"picture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// With FileHandler method we chose the place where we physically sage the picture
		
	}

	
	

}
