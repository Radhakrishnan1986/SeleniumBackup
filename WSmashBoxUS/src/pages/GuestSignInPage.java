package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuestSignInPage {

public static void enterNewusereAddress(WebDriver wd, String emailaddress) {
	WebElement emailadd = wd.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[1]/div[4]/div/fieldset/form/div[1]/input"));
	emailadd.sendKeys(emailaddress);
}

public static void clickCheckoutAsGuestButton(WebDriver wd) {
	WebElement guestsubmitbutton = wd.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/section/div[2]/section[1]/div[4]/div/fieldset/form/div[2]/input"));
	guestsubmitbutton.click();
}

	
}
