package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GuestOrderConfirmationPage {

	public static void enterpassword(WebDriver wd, String password) {
		WebElement password1 = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[1]/div/div[1]/section/div[2]/form/section/fieldset/div[3]/div[1]/input"));
		password1.sendKeys(password);
	}
	
	public static void selectMonth(WebDriver wd, String month) {
		WebElement month1 = wd.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/section/div[1]/div/div[1]/section/div[2]/form/div[1]/section/div/fieldset/div[1]/div/div[1]"));
		Select s = new Select(month1);
		s.selectByValue(month);
	}
	
	public static void selectDate(WebDriver wd, String date) {
		WebElement date1 = wd.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/section/div[1]/div/div[1]/section/div[2]/form/div[1]/section/div/fieldset/div[2]/div/div[1]"));
		Select s = new Select(date1);
		s.selectByValue(date);
	}
	
	public static void clickJoinButton(WebDriver wd) {
		WebElement joinbutton = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[5]/div[4]/div/form/div[3]/input[1]"));
		joinbutton.click();
	}
	
	public static void clickContunueasGuestLink(WebDriver wd) {
		WebElement contunueasGuestLink = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[1]/div/div[1]/section/div[2]/form/fieldset/div[1]/a"));
		contunueasGuestLink.click();
	}
	
}
