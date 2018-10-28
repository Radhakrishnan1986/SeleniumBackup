package xPathTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.bing.com/");
		WebElement input = wd.findElement(By.xpath("//input[contains(@name,'q')]"));
		input.sendKeys("abc");
		input.sendKeys(Keys.ENTER);
		
		/*String output = input.getText();
		System.out.println(output);*/
		
		//span[contains(text(),'langauag')]
		//span[contains(text(),'langauag')]
		//input[contains(@class,'b_searchbox')]
		//input[contains(@id,'sb_form_q')]
		//input[contains(@name,'q')]
		//input[contaions(@title,'Enter your search term')]

		//span[contains(text(),'Langu')]/following::a[2]
		//*[contains(@id,'scpl4')]/preceding::a[2]
		//*[@id="scpl2"]

	}

}
