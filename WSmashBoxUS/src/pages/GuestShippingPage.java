package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GuestShippingPage {

	public static void enterFirstName(WebDriver wd, String firstname) {
		WebElement usernamefield = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[2]/div[4]/form/section[1]/div[2]/div/fieldset/div[1]/div[1]/input"));
		usernamefield.sendKeys(firstname);
	}
	
	public static void enterlastName(WebDriver wd, String lastname) {
		WebElement usernamefield = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[2]/div[4]/form/section[1]/div[2]/div/fieldset/div[1]/div[1]/input"));
		usernamefield.sendKeys(lastname);
	}
	
	public static void enteraddress1(WebDriver wd, String address1) {
		WebElement useraddress1 = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[2]/div[4]/form/section[1]/div[2]/div/fieldset/div[1]/div[1]/input"));
		useraddress1.sendKeys(address1);
	}
	public static void enterZipcode(WebDriver wd, String zipcode) {
		WebElement zipcode1 = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[2]/div[4]/form/section[1]/div[2]/div/fieldset/div[3]/div[1]/input"));
		zipcode1.sendKeys(zipcode);
	}

	public static void enterCityname(WebDriver wd, String city) {
		WebElement city1 = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[2]/div[4]/form/section[1]/div[2]/div/fieldset/div[3]/div[2]/input"));
		city1.sendKeys(city);
	}

	public static void selectState(WebDriver wd, String State) {
		WebElement state1 = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[2]/div[4]/form/section[1]/div[2]/div/fieldset/div[3]/div[3]/div/div[1]"));
		Select s = new Select(state1);
		s.deselectByValue("NY");
	}
	
	public static void enterPhonenumber(WebDriver wd, String phonenumber) {
		WebElement phonenumber1 = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[2]/div[4]/form/section[1]/div[2]/div/fieldset/div[5]/div/input[1]"));
		phonenumber1.sendKeys(phonenumber);
	}
	
	public static void enterContinueButton(WebDriver wd) {
		WebElement continueButton = wd.findElement(By.xpath(
				"html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[2]/div[4]/form/fieldset/div/input"));
		continueButton.click();
	}

}
