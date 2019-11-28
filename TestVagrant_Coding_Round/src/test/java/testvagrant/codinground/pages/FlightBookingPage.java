package testvagrant.codinground.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import testvagrant.codinground.config.Configuration;

public class FlightBookingPage {
	WebDriver driver;

	public FlightBookingPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(xpath = Configuration.Fromtextbox)
	WebElement Fromtextbox;
	@CacheLookup
	@FindBy(xpath = Configuration.Selectcity)
	WebElement Selectcity;
	@CacheLookup
	@FindBy(xpath = Configuration.Tocity)
	WebElement Tocity;
	@CacheLookup
	@FindBy(xpath = Configuration.Selecttocity)
	WebElement Selecttocity;
	@CacheLookup
	@FindBy(xpath = Configuration.Departon)
	WebElement Departon;
	@CacheLookup
	@FindBy(xpath = Configuration.Selectdate)
	WebElement Selectdate;
	@CacheLookup
	@FindBy(xpath = Configuration.Searchbutton)
	WebElement Searchbutton;
	@CacheLookup
	@FindBy(css = Configuration.Book)
	WebElement Book;
	@CacheLookup
	@FindBy(css = Configuration.BookingConfirm)
	WebElement BookingConfirm;
	@CacheLookup
	@FindBy(css = Configuration.Cleartrip)
	WebElement Cleartrip;
	

	// Defining all the user actions (Methods) that can be performed in the
	// FlightBookingPage
	// This method to click on from city

	public void fromCity(String fromcity) {
		Fromtextbox.click();
		Fromtextbox.sendKeys(fromcity);
		Selectcity.click();

	}

	// This method to click on to city

	public void toCity(String tocity) {
		Tocity.click();
		Tocity.sendKeys(tocity);
		Selecttocity.click();

	}

	// This method to click on date

	public void clickOnDate() {

		Selectdate.click();
		

	}
	// This method to click on search

	public void clickSearch() {

		Searchbutton.click();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	// This method to click on Booking
	public void clickOnBook() {

		Book.click();
		String Actualdata = BookingConfirm.getText();
		assertEquals(Actualdata, "Book in three simple steps", "Flight bookingconfimed to bangalore");
		Cleartrip.click();

	}

}
