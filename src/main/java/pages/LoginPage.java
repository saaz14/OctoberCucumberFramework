package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "txtUsername")
	public WebElement LoginUserNameBox;
	
	@FindBy(id = "txtPassword")
	public WebElement LoginPasswordBox;
	
	@FindBy(id = "btnLogin")
	public WebElement LoginBtn;

}
