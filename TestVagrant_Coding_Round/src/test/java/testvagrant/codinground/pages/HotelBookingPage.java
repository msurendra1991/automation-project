package testvagrant.codinground.pages;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import testvagrant.codinground.config.Configuration;

public class HotelBookingPage {
	WebDriver driver;

	public HotelBookingPage(WebDriver driver) {
		this.driver = driver;
	}

	// Using FindBy for locating elements
	@FindBy(xpath = Configuration.Hotel)
	WebElement Hotel;
	@CacheLookup
	@FindBy(xpath = Configuration.Wheresearch)
	WebElement Wheresearch;
	@CacheLookup
	@FindBy(xpath = Configuration.Selectlocation)
	WebElement Selectlocation;
	@CacheLookup
	@FindBy(xpath = Configuration.Checkin)
	WebElement Checkin;
	@CacheLookup
	@FindBy(xpath = Configuration.Checkout)
	WebElement Checkout;
	@CacheLookup
	@FindBy(xpath = Configuration.Text)
	WebElement Text;
	
	
	// Defining all the user actions (Methods) that can be performed in the
		// HoteltBookingPage
		// This method to click on Hotel

		public void clickOnHotel() {
			
			Hotel.click();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		}
		// This method for Hotel location

				public void searchLocation(String input) {
					Wheresearch.click();
					Wheresearch.sendKeys(input);
					Selectlocation.click();
					
				}
				
				// This method for Room check-in and Check-out

				public void checkinCheckout() {
					Checkin.click();
					driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
					
					Checkout.click();
					String Actualdata=Text.getText();
					assertEquals(Actualdata, "Search for hotels");
					
					
				}

}
