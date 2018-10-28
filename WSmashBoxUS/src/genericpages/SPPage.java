package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SPPage {

	public static void addProduct(WebDriver wd) {
		WebElement addtobag = wd
				.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/div[1]/div[3]/a[1]"));
		addtobag.click();

	}
	
}
