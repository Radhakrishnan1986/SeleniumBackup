package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class meniCart {

	public static void minkartcbutton(WebDriver wd) {
		WebElement minkartcbutton = wd
				.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[6]/div/div/div/div/div/footer/a"));
		minkartcbutton.click();

	}
}
