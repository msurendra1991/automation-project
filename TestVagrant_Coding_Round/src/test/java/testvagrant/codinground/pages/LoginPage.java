package testvagrant.codinground.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import testvagrant.codinground.config.Configuration;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(xpath = Configuration.Yourtrips)
	WebElement Yourtrips;
	@CacheLookup
	@FindBy(xpath = Configuration.SignIn)
	WebElement SignIn;
	@CacheLookup
	@FindBy(xpath = Configuration.Username)
	WebElement Username;
	@CacheLookup
	@FindBy(xpath = Configuration.Password)
	WebElement Password;
	@CacheLookup
	@FindBy(xpath = Configuration.SignInButton)
	WebElement SignInButton;

	// Defining all the user actions (Methods) that can be performed in the
	// SignIn page

	// This method to click on Your Trip
	public void clickOnYourTrip() {
		Yourtrips.click();

	}

	// This method to click on signIn
	public void clickOnSignIn() {
		SignIn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("modal_window");

	}

	// This method to enter user name
	public void setUsername(String username) {
		// Implicit wait

		Username.click();

		Username.sendKeys(username);

	}

	// This method to enter password
	public void setPassword(String password) {
		Password.click();

		Password.sendKeys(password);

	}

	// This method to click on SignIn button
	public void clickOnSignInButton() {
		SignInButton.click();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
