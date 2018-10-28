package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GuestBillingPage {
	public static void enterCCnumber(WebDriver wd, String CCnumber) {
		WebElement CCnumber1 = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[3]/div[2]/form/div[2]/div/fieldset/div[2]/div[2]/input"));
		CCnumber1.sendKeys(CCnumber);
	}
	
	public static void selectMonth(WebDriver wd, String month) {
		WebElement month1 = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select[1]"));
		Select s = new Select(month1);
		s.selectByValue(month);
	}
	public static void selectyear(WebDriver wd, String year) {
		WebElement year1 = wd.findElement(By.xpath("html/body/section/div/div[2]/div/form/select[1]"));
		Select s = new Select(year1);
		s.selectByValue(year);
	}
	
	public static void enterCVVnumber(WebDriver wd, String CVVNumber) {
		WebElement CVVNumber1 = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[3]/div[2]/form/div[2]/div/fieldset/div[2]/div[5]/input"));
		CVVNumber1.sendKeys(CVVNumber);
	}
	
	public static void clickContinueButton(WebDriver wd) {
		WebElement continueButton = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[3]/div[2]/form/fieldset[2]/div/div[2]/input"));
		continueButton.click();
	}
	
}
