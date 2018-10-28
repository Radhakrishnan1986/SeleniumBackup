package oct18Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class October27Test {

	WebDriver wd;
	@Parameters({"Browser"})
	
	@BeforeTest
	public void beforetest(String Browser) {
		if(Browser.equals("Firefox")) {
			wd = new FirefoxDriver();
		}
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\SeleniumWorkspace\\WebdriverTest\\Browser\\chromedriver.exe");
			wd = new ChromeDriver();
		}
		
	}

	public void sample() throws InterruptedException {
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement input = wd
				.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[2]/div[2]/form/div[1]/input[1]"));
		input.sendKeys("abc");
		input.submit();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().refresh();
		
	}
}
