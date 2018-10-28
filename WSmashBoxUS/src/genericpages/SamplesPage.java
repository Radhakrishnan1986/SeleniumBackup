package genericpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamplesPage {
	public static void selectsamplebutton(WebDriver wd) {
		WebElement selectsamplebutton = wd
				.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/section/div[4]/div[1]/div/section[3]/div[2]/div/div/a[2]"));
		selectsamplebutton.click();
}
	public static void continuebutton(WebDriver wd) {
		WebElement continuebutton = wd
				.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/section/section/div[2]/div/div[1]"));
		continuebutton.click();
}
	
	public static void noThankslink(WebDriver wd) {
		WebElement noThankslink = wd
				.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/section/section/div[2]/div/div[3]/a"));
		noThankslink.click();
}
}