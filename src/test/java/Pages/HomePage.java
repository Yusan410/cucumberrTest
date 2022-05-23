package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
		
		

	}
	
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]")
	public WebElement allservice;
	
	
	public void Homepage() {
		
		
		
		Assert.assertTrue(allservice.isDisplayed());
	}

}
