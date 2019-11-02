package stepDef;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AdminPage;
import pages.LandingPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class stepDefination {
	
	LoginPage loginPage = new LoginPage();
	LandingPage landingPage = new LandingPage();
	AdminPage adminPage = new AdminPage();
	

    @Given("^Navigate to url$")
    public void navigate_to_url() {
    	
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("^Login using valid Credentials provided$")
    public void login_using_valid_Credentials_provided() {

        loginPage.LoginUserNameBox.sendKeys(ConfigurationReader.getProperty("userName"));
        loginPage.LoginPasswordBox.sendKeys(ConfigurationReader.getProperty("passWord"));
        loginPage.LoginBtn.click();
    }

    @When("^Validate you're logged in by verifying Welcome Admin$")
    public void validate_you_re_logged_in_by_verifying_Welcome_Admin() {

    	String validate = landingPage.WelcomeAdmin.getText();
		Assert.assertTrue(validate.contains("Welcome Admin"));
    }

    @Then("^Click on ADMIN to navigate to the page$")
    public void click_on_ADMIN_to_navigate_to_the_page(){

        adminPage.AdminTab.click();
    }

    @Then("^Search for \"([^\"]*)\" within the table and capture the value$")
    public void Search_for(String arg1)  {    
    	
    	for (int numberOfRows = 1; numberOfRows <= 10; numberOfRows++) {

            for (int numberOfCol = 1; numberOfCol <= 5; numberOfCol++) {
            	
            	String TableValues = Driver.getDriver().findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[" + numberOfRows + "]/td[" + numberOfCol + "]")).getText();
               
                
                if (TableValues.contains(arg1)) {
                	System.out.println("Gotcha!");
                } else {
                	
                }
                
            

            }

        }
   	
    }

    @Then("^Logout$")
    public void logout()  {
        
    	landingPage.WelcomeAdmin.click();
    	BrowserUtils.waitFor(2);
    	landingPage.Logout.click();
    }


}