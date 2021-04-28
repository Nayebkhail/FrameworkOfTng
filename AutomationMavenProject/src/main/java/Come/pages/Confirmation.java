package Come.pages;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Email address already in use')]") WebElement Heading;
	@FindBy(xpath = "//*[contains(text(),'You indicated you ')]") WebElement Subtext;
	@FindBy(xpath = "//*[contains(text(),' Are you a returning customer')]")WebElement Confirm;
	
	public Confirmation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	public WebElement massage() {
		return Heading;	
	}
	public WebElement submessage() {
		return Subtext;
	}
	public WebElement messagecon() {
		return Confirm;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
