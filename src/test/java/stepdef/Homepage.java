package stepdef;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.BaseClass;
import Utilities.CommonMethod;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage extends CommonMethod {

	@Given("User is on HomePage")
	public void user_is_on_home_page() throws InterruptedException {

		//BaseClass.getDriver().get(BaseClass.getProperty("Url"));

		wait(3);

		// ((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,2000)");
		scrollDown(2000);
	}
  
		
		
	

	@When("Under Dental Services In Thornhill\" Verify that all services are visible")
	public void under_dental_services_in_thornhill_verify_that_all_services_are_visible() {

		//WebElement element = all.allservice;
		
		all.Homepage();

		

	}

	@Given("Click on {string} under Dental Services In Thornhill")
	public void click_on_under_dental_services_in_thornhill(String string) {

		ver.compsitefillingpage.click();

	}

	@Then("You will go to the next page, verify with the header {string} is correct then go back to homepage use example list below")
	public void you_will_go_to_the_next_page_verify_with_the_header_is_correct_then_go_back_to_homepage_use_example_list_below(
			String string) throws InterruptedException {

		//String ActualTitle = BaseClass.getDriver().getTitle();

		Assert.assertEquals(BaseClass.getDriver().getTitle(), BaseClass.getProperty("Compositepagetitle"));

		BaseClass.driver.navigate().back();

		// dentalbondingPage

		ver.dentalbondingPage.click();

		String ActualTitle1 = BaseClass.getDriver().getTitle();

		Assert.assertEquals(BaseClass.getDriver().getTitle(), BaseClass.getProperty("DentalBondingPagetitle"));

		// dentalbridgepage

		

		BaseClass.driver.navigate().back();

		ver.dentalBridgePage.click();

		String ActualTitle2 = BaseClass.getDriver().getTitle();

		

		Assert.assertEquals(ActualTitle2,BaseClass.getProperty("DentalBridgeTitle"));

		// dental crownpage
		BaseClass.driver.navigate().back();

		ver.dentalcrownpage.click();

		String ActualTitle3 = BaseClass.getDriver().getTitle();

		//String dentalCrownsTitle = "Dental Crowns in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTitle3, BaseClass.getProperty("dentalCrownsTitle"));

		BaseClass.driver.navigate().back();
		ver.dentalextractionsPage.click();

		Thread.sleep(1500);

		String ActualTitle4 = BaseClass.getDriver().getTitle();

		String dentalExtractionsTitle = "Dental Extractions in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTitle4, dentalExtractionsTitle);

		BaseClass.driver.navigate().back();

		ver.dentalImlementPage.click();

		String ActualTtitle5 = BaseClass.getDriver().getTitle();

		String ImplantsPageTtitle = "Dental Implants in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle5, ImplantsPageTtitle);

		BaseClass.driver.navigate().back();

		ver.denturePage.click();

		String ActualTtitle6 = BaseClass.getDriver().getTitle();

		String DenTuresTitle = "Dentures in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle6, DenTuresTitle);

		BaseClass.driver.navigate().back();

		ver.RootCleanPage.click();

		String ActualTtitle7 = BaseClass.getDriver().getTitle();

		String RootCanalTtitle = "Root Canal in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle7, RootCanalTtitle);

		BaseClass.driver.navigate().back();

		ver.sameDayCrownsPage.click();

		String ActualTtitle8 = BaseClass.getDriver().getTitle();

		String SameDayPageTitle = "Same-Day Crowns in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle8, SameDayPageTitle);

		BaseClass.driver.navigate().back();

		ver.TethCleaningPage.click();

		String ActualTtitle9 = BaseClass.getDriver().getTitle();

		String TeethCleaningTtitle = "Teeth Cleanings in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle9, TeethCleaningTtitle);

		BaseClass.driver.navigate().back();

		ver.dentalVennersPage.click();

		String ActualTtitle10 = BaseClass.getDriver().getTitle();

		String DentalVeneersTtitle = "Dental Veneers in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle10, DentalVeneersTtitle);

		BaseClass.driver.navigate().back();

		ver.InvisalginPage.click();

		String ActualTtitle11 = BaseClass.getDriver().getTitle();

		String InvisalignTtitle = "Invisalign in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle11, InvisalignTtitle);

		BaseClass.driver.navigate().back();

		ver.OrthodonticsPage.click();

		String ActualTtitle12 = BaseClass.getDriver().getTitle();

		String OrthodonticsTtitle = "Orthodontics in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle12, OrthodonticsTtitle);

		BaseClass.driver.navigate().back();

		ver.TeethWhitenningPage.click();

		String ActualTtitle13 = BaseClass.getDriver().getTitle();

		String TeethWhiteningTtitle = "Teeth Whitening in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(ActualTtitle13, TeethWhiteningTtitle);

		BaseClass.driver.navigate().back();

		ver.childFirstAppointmentPage.click();

		String actualtitle = BaseClass.getDriver().getTitle();

		String chidlsAppointmentPtitle = "Child’s First Appointment in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle, chidlsAppointmentPtitle);

		BaseClass.driver.navigate().back();

		ver.orthodonticTeensPage.click();

		String actualtitle1 = BaseClass.getDriver().getTitle();

		String ExpectedTtitle = "Orthodontics for Teens in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle1, ExpectedTtitle);

		BaseClass.driver.navigate().back();

		ver.EductionsPage.click();

		String actualtitle2 = BaseClass.getDriver().getTitle();

		String expectedtitle = "Pediatric Treatment & Education in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle2, expectedtitle);

		BaseClass.driver.navigate().back();

		ver.sealantsPage.click();

		String actualtitle3 = BaseClass.getDriver().getTitle();

		String expectedtitle1 = "Sealants and Fluoride Treatment in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle3, expectedtitle1);

		BaseClass.driver.navigate().back();

		ver.TeethCleanForKidsPage.click();

		String actualtitle4 = BaseClass.getDriver().getTitle();

		String expectedTitle = "Teeth Cleanings for Kids in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle4, expectedTitle);

		BaseClass.driver.navigate().back();

		ver.oralCancerPage.click();

		String actualtitle5 = BaseClass.getDriver().getTitle();

		String oralcancerPageTitle = "Oral Cancer Screening in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle5, oralcancerPageTitle);

		BaseClass.driver.navigate().back();

		ver.smileDesignPage.click();

		String actualtitle6 = BaseClass.getDriver().getTitle();

		String smileDesignTitle = "Smile Design in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle6, smileDesignTitle);

		BaseClass.driver.navigate().back();

		ver.sportsGuardsPage.click();

		String actualtitle7 = BaseClass.getDriver().getTitle();

		String sportsGuardsTitle = "Sports Guards in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle7, sportsGuardsTitle);

		BaseClass.driver.navigate().back();

		ver.toothSencitivityPage.click();

		String actualtitle8 = BaseClass.getDriver().getTitle();

		String toothSencitivityTitle = "Tooth Sensitivity Treatment in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle8, toothSencitivityTitle);

		BaseClass.driver.navigate().back();

		ver.widsomTeethPage.click();

		String actualtitle9 = BaseClass.getDriver().getTitle();

		String WisdomTeetPageTitle = "Wisdom Teeth Extraction in Thornhill, Ontario | Disera Dental";

		Assert.assertEquals(actualtitle9, WisdomTeetPageTitle);
	}

	@Given("user is on HomePage")
	public void user_is_on_home_page1() {
		BaseClass.getDriver().navigate().to(BaseClass.getProperty("Url"));

	}

	@Then("On the top of menu button click on services then each categories of service are clickable, Click on service_catagory")
	public void on_the_top_of_menu_button_click_on_services_then_each_categories_of_service_are_clickable_click_on_service_catagory() {

		rrr.Servicebutton.click();
		

	}

	@Then("Verify all services in this category are visible service_list")
	public void verify_all_services_in_this_category_are_visible_service_list() throws InterruptedException {

		Thread.sleep(3000);
		rrr.GeneralDentsryPage.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,2400)");

		WebElement element = rrr.allserviceVisible;

		Assert.assertTrue(element.isDisplayed());

		BaseClass.driver.navigate().back();

		Thread.sleep(3000);

		rrr.Servicebutton.click();

		Thread.sleep(2000);

		rrr.CosmeticDentistry.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,1800)");

		WebElement element1 = rrr.ourCosmeticService;

		Assert.assertTrue(element1.isDisplayed());

		Thread.sleep(3000);

		rrr.Servicebutton.click();

		rrr.ChildrenDentistryPage.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,1600)");

		WebElement element2 = rrr.OurChildrenService;

		Assert.assertTrue(element2.isDisplayed());

		Thread.sleep(3000);

		rrr.Servicebutton.click();

		rrr.additionalServicepage.click();

		((JavascriptExecutor) BaseClass.driver).executeScript("scroll(0,1600)");

		WebElement element3 = rrr.ouradditionalservice;

		Assert.assertTrue(element3.isDisplayed());

		// Assert.assertEquals(element3, rrr.ouradditionalservice.getText());

		element3.getText();

		Thread.sleep(3000);

		rrr.HomePage.click();

	}
	  @After
		public void after() {
	    	
	    	driver.quit();
	  }

}
