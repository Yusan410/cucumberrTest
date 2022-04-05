package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class AllserviceClickTable {

	public AllserviceClickTable() {
		
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	
	
	
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[1]/a")
	public WebElement compsitefillingpage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[2]/a")
	public WebElement dentalbondingPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[3]/a")
	public WebElement dentalBridgePage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[4]/a")
	public WebElement dentalcrownpage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[5]/a")
	public WebElement dentalextractionsPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[6]/a")
	public WebElement dentalImlementPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[7]/a")
	public WebElement denturePage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[8]/a")
	public WebElement RootCleanPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[9]/a")
	public WebElement sameDayCrownsPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li[10]/a")
	public WebElement TethCleaningPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[2]/ul/li[1]/a")
	public WebElement dentalVennersPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[2]/ul/li[2]/a")
	public WebElement  InvisalginPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[2]/ul/li[3]/a")
	public WebElement OrthodonticsPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[2]/ul/li[4]/a")
	public WebElement TeethWhitenningPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[3]/ul/li[1]/a")
	public WebElement childFirstAppointmentPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[3]/ul/li[2]/a")
	public WebElement orthodonticTeensPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[3]/ul/li[3]/a")
	public WebElement EductionsPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[3]/ul/li[4]/a")
	public WebElement sealantsPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[3]/ul/li[5]/a")
	public WebElement TeethCleanForKidsPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[4]/ul/li[1]/a")
	public WebElement oralCancerPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[4]/ul/li[2]/a")
	public WebElement smileDesignPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[4]/ul/li[3]/a")
	public WebElement sportsGuardsPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[4]/ul/li[4]/a")
	public WebElement toothSencitivityPage;
	@FindBy(xpath="//*[@id=\"services\"]/div/div[2]/div/div[4]/ul/li[5]/a")
	public WebElement widsomTeethPage;
}
