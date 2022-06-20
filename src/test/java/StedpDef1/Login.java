package StedpDef1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.BaseClass;
import Utilities.CommonMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login extends CommonMethod{
	
	
	WebDriver driver;
	
	@Given("Navigate to home page")
	public void navigate_to_home_page() {
		
		BaseClass.getDriver().get(BaseClass.getProperty("Urrl"));
		
		wait(5);
	    
	}

	@Given("Click on My Account Menu")
	public void click_on_my_account_menu() {
		
		
		
		DC3.My_Account.click();
	   
	}

	

	@When("Enter registered {string} username textbox")
	public void enter_registered_username_textbox(String username) {
		
		DC3.UsenameBox.sendKeys(username);
		
		
	    
	}
	@When("Enter {string} in password textbox")
	public void enter_in_password_textbox(String password) {
		
		
		DC3.PasswordBox.sendKeys(password);
		
		
		
	    
	}
		

	@When("Click on login button")
	public void click_on_login_button() {
		
		DC3.loginButton.click();
		
		
		
		
		
	   
	}

	@Then("User on home page")
	public void user_on_home_page() {
		
		wait(4);
		
		String actualtitle = "My Account – Automation Practice Site";
		
		
		
		Assert.assertEquals(actualtitle, BaseClass.getDriver().getTitle());
	   
	}


	@Then("Click on sign out button")
	public void click_on_sign_out_button() {
		
		DC3.Signout.click();
	    
	}
	@Then("Verify the page header")
	public void verify_the_page_header() {
		
		String title = "My Account – Automation Practice Site";
		
		Assert.assertEquals(BaseClass.getDriver().getTitle(), title);
	    
	}




}
