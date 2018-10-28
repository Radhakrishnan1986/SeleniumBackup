package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GnavLinks {

	public static void clickSignInlink(WebDriver wd) {
		WebElement signInlink = wd
				.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/a/span[1]"));
		signInlink.click();
	}
	
	public static void clickCartlink(WebDriver wd) {
		WebElement Cartlink = wd
				.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[6]/div/a/i"));
		Cartlink.click();

	}
	
	
}
