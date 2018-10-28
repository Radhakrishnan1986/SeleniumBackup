package myAccountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLandingPage {

	public static void clickCloseicon(WebDriver wd) {
		WebElement closeIcon = wd.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[1]/div/section[1]/a"));
		closeIcon.click();
	}
	
	public static void clickSignOutlink(WebDriver wd) {
		WebElement signoutlink = wd.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[1]/div/section[1]"));
		signoutlink.click();
	}

	public static void clickaccountOverviewLink(WebDriver wd) {
		WebElement accountoverview = wd.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[1]/div/section[2]/section/ul/li[1]/a"));
		accountoverview.click();
	}
}
