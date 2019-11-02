package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LandingPage {
	
	public LandingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "welcome")
	public WebElement WelcomeAdmin;
	
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	public WebElement Logout;
	


}
