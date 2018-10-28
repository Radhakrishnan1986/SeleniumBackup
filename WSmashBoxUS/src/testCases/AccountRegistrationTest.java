package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import genericpages.GnavLinks;
import myAccountpages.AccountLandingPage;
import myAccountpages.SignInOverlay;

public class AccountRegistrationTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.smashbox.com/");

		GnavLinks.clickSignInlink(wd);
		Thread.sleep(4000);
		SignInOverlay.clickIDonthaveAccLink(wd);
		SignInOverlay.enterFirstName(wd, "Test 1");
		SignInOverlay.enterLastName(wd, "Test 2");
		SignInOverlay.enteremailAddress(wd, "testsbx14101d@yopmail.com");
		SignInOverlay.enterPassword(wd, "password");
		SignInOverlay.selectTCCheckbox(wd);
		SignInOverlay.clickRegistertButton(wd);
		Thread.sleep(4000);
		AccountLandingPage.clickCloseicon(wd);
		AccountLandingPage.clickaccountOverviewLink(wd);
		AccountLandingPage.clickSignOutlink(wd);
	}

}
