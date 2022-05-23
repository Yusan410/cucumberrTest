package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class TestCase3 {
	
	public TestCase3() {
		
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	

	@FindBy(id="service-button")
	public WebElement Servicebutton;
	@FindBy(xpath="//*[@id=\"service-menu\"]/div/div[1]/a/h4")
	public WebElement GeneralDentsryPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]")
	public WebElement allserviceVisible;
	@FindBy(xpath="//*[@id=\"service-menu\"]/div/div[2]/a/h4")
	public WebElement CosmeticDentistry;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]")
	public WebElement ourCosmeticService;
	@FindBy(xpath="//*[@id=\"service-menu\"]/div/div[3]/a/h4")
	public WebElement ChildrenDentistryPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]")
	public WebElement OurChildrenService;
	@FindBy(xpath="//*[@id=\"service-menu\"]/div/div[4]/a/h4")
	public WebElement additionalServicepage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]")
	public WebElement ouradditionalservice;
	@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[1]/a/img")
	public WebElement HomePage;
	
	
		
		
		
	}
	


