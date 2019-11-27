package honestfoodcompany.famework.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import honestfoodcompany.famework.config.Configuration;

public class MamacitaBrandPage {

	WebDriver driver;

	public MamacitaBrandPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(xpath = Configuration.Club)
	WebElement Club;
	@FindBy(xpath = Configuration.Mamacita)
	WebElement Mamacita;
	@FindBy(xpath = Configuration.Addressinput)
	WebElement Addressinput;
	@FindBy(xpath = Configuration.Password)
	WebElement Password;
	@FindBy(xpath = Configuration.Cookiepolicy)
	WebElement Cookiepolicy;
	@FindBy(xpath = Configuration.Submit)
	WebElement Submit;
	@FindBy(xpath = Configuration.Titletext)
	WebElement Titletexts;

	// Defining all the user actions (Methods) that can be performed in the
	// Mamacita page

	public void clickOnCookiepolicy() {
		Cookiepolicy.click();
	}

	// This method to click on Mamacita
	public void clickOnMamacita() {
		Mamacita.click();

	}

	// This method to click on signIn
	public void addressInput(String inputdata) {
		Addressinput.click();
		Addressinput.sendKeys(inputdata);

	}

	public void clickOnSubmit() {
		Submit.click();

	}
	public void text() {
		String actualdata=Titletexts.getText();
		assertEquals(actualdata,"Mamacita" );

	}

}
