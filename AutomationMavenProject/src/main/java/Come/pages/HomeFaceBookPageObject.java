package Come.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFaceBookPageObject {
	public WebDriver driver;
	@FindBy(name="email") WebElement emailIdField;
	@FindBy(name="pass") WebElement psword;
	@FindBy(name="login") WebElement loginbutton;
public HomeFaceBookPageObject(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void emailIdField(String email) {
	emailIdField.clear();
	emailIdField.sendKeys(email);
	
}
public void paswordIdField(String password) {
	psword.sendKeys(password);
}
public void loginField() {
	loginbutton.click();
	
}
}
	
	
	


