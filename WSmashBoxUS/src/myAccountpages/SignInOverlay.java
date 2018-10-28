package myAccountpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInOverlay {

	public static void clickIDonthaveAccLink(WebDriver wd) {
		WebElement iIDonthaveAccLink = wd
				.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/form[2]/div[1]/div[1]/span[2]"));
		iIDonthaveAccLink.click();
	}
	
	public static void enterFirstName(WebDriver wd, String firstName) {
		WebElement firstName1 = wd
				.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/form[1]/div/div[2]/input"));
		firstName1.sendKeys(firstName);
	}
	
	public static void enterLastName(WebDriver wd, String lastName) {
		WebElement lastName1 = wd
				.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/form[1]/div/div[3]/input"));
		lastName1.sendKeys(lastName);
	}
	
	public static void enteremailAddress(WebDriver wd, String emailaddress) {
		WebElement emailadd = wd.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/form[1]/div/div[4]/input"));
		emailadd.sendKeys(emailaddress);
	}

	public static void enterPassword(WebDriver wd, String password) {
		WebElement password1 = wd.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/form[1]/div/div[5]/input"));
		password1.sendKeys(password);
	}
	
	public static void selectTCCheckbox(WebDriver wd) {
		WebElement checkbox = wd.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/form[1]/div/div[7]/label[1]/input"));
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}
	
	public static void clickRegistertButton(WebDriver wd) {
		WebElement RegisterButton = wd.findElement(By.xpath("html/body/div[1]/header/div[2]/div/div[2]/div/div/div/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/div[1]/form[1]/div/div[7]/input"));
		RegisterButton.click();
	}
	
}
