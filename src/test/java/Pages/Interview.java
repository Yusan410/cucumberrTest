package Pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Interview {

	WebDriver driver;
	WebDriverWait wait;

	@Before
	public void befroe() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://news.google.com/topstories?tab=rn&hl=en-US&gl=US&ceid=US:en");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {

	driver.findElement(By.xpath(
				"//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div[2]/div[2]/div/main/c-wiz/div[1]/div[1]/div[3]/div/div/article"))
				.click();

		driver.findElement(By.xpath(
				"//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div[2]/div[2]/div/main/c-wiz/div[1]/div[1]/div[4]/div/div/article"))
				.click();

		driver.findElement(By.xpath(
				"//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div[2]/div[2]/div/main/c-wiz/div[1]/div[1]/div[6]/div/div/article"))
			.click();

		driver.findElement(By.xpath(
			"//*[@id=\"yDmH0d\"]/c-wiz[1]/div/div[2]/div[2]/div/main/c-wiz/div[1]/div[1]/div[7]/div/div/article"))
				.click();

		
		
		
		
//		String parent = driver.getWindowHandle();
//		
//		System.out.println(parent);

		List<String> windows = new ArrayList<String>(driver.getWindowHandles());

		System.out.println(windows.size());

		for (int i = 0; i < windows.size(); i++) {

			System.out.println(driver.switchTo().window(windows.get(i)).getTitle());
		}

	}

}
