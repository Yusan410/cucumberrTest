package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage {
	
	public LoginPage() {
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a")
	public WebElement Signout;
	@FindBy(id="menu-item-50")
	public WebElement My_Account;
	@FindBy(id="username")
	public WebElement UsenameBox;
	@FindBy(id="password")
	public WebElement PasswordBox;
	@FindBy(xpath="//input[@name='login']")
	public WebElement loginButton;

}
