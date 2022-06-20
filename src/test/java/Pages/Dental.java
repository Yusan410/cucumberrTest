package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dental {

	WebDriver driver;

	@Before
	public void setup() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://diseradental.ca/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//// *[@id="services"]/div/div[2]/div/div[1]/ul/li

	}
	@Test
	public void test() throws InterruptedException {
		
		
		List<WebElement> element = 
				driver.findElements(By.xpath("//*[@id=\"services\"]/div/div[2]/div/div[1]/ul/li"));
		
		for(int i = 0; i < element.size();i++) {
			
			element.get(i).click();
			
			
			
	
		}
		
	}

}
