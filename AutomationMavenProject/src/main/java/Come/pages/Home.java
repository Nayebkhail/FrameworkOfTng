package Come.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	// According to the page object module we have to perform the three following steps.
	//1- Store the elements with the of locators.
	WebDriver driver;
	@FindBy(id = "nav-link-accountList")
	WebElement Sign;
	
	@FindBy(xpath = "//*[text()='Sign in']") WebElement signinbutton;
	
	public Home(WebDriver driver) {
		//2-  second step: we have to create the page factory constructor inside each class.
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	//3-  creation of methods according to the actions and have to put on each element.
	public void SignOverPointer() {
	    Actions ob=new Actions(driver);
		ob.moveToElement(Sign).build().perform();
		
	}
	
	public void signButtonClick() {
	    Actions ob=new Actions(driver);
	    ob.moveToElement(signinbutton).click().build().perform();
	}
	// this set of code shoes how many links available and we created the object of the this class in FabookSignThroughPropertiesFile and run through function class
	public void findlinks() {
		List<WebElement> linksid=driver.findElements(By.tagName("a"));
		System.out.println(linksid.size());
		for(WebElement lk:linksid) {
			System.out.println(lk.getText());
		}
		
	}
	
	// Note: The page class is not executable because there is not main method and we just store the elements
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
