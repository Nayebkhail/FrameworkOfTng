package Come.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatAmazonAccountTng {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='createAccountSubmit']") WebElement CreateAnAccount;
	public CreatAmazonAccountTng(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
		
	public void ClickOnCreate() {
		CreateAnAccount.click();
	}

	
		
	
		
		
    
}


	








	









		
		
  
	

