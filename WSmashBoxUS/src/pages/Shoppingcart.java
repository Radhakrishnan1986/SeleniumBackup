package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shoppingcart {
	public static void cartcbutton(WebDriver wd) {
		WebElement cartcbutton = wd
				.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/section/div[4]/div[1]/div/section[3]/div[2]/div/div/a[2]"));
		cartcbutton.click();
}
}