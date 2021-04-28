package Come.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCreateAcc {
	WebDriver driver;
	@FindBy(name = "customerName") WebElement YourNameField;
	@FindBy(name = "email") WebElement EmailAddress;
	@FindBy(name = "password") WebElement Pasword;
	@FindBy(name = "passwordCheck") WebElement CheckPassword;
	@FindBy(xpath = "//*[@id='continue']") WebElement CreatAmazAccount;
	
	public AmazonCreateAcc(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void CustomerField(String name) {
		YourNameField.sendKeys(name);
	}
	public void Email(String email) {
		EmailAddress.sendKeys(email);
	}
	
	public void pass(String pass) {
	Pasword.sendKeys(pass);	
	}
	
	public void forgetpass(String pass) {
	CheckPassword.sendKeys(pass);
	}
	
	public void crAccount() {
		CreatAmazAccount.click();
		Confirmation confir=new Confirmation(driver);
		String heading=confir.massage().getText();
		System.out.println(heading);
	}
	
	
	
	
	
	
}



