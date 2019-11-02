package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AdminPage {

	public AdminPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement AdminTab;
	
	
	
}
