package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestOrderReviewPage {
	
	public static void clickPlaceorderButton(WebDriver wd) {
		WebElement placeOrderbutton = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[5]/div[4]/div/form/div[3]/input[1]"));
		placeOrderbutton.click();
	}
}
