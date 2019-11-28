package testvagrant.codinground.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testvagrant.codinground.pages.FlightBookingPage;
import testvagrant.codinground.pages.HotelBookingPage;
import testvagrant.codinground.pages.LoginPage;
import testvagrant.codinground.testbase.TestBase;

public class SignInTest extends TestBase {

	// User Login test scenario
	@Test(dataProvider = "loginData", priority = 0,enabled=true)
	public void userSignInTest(String username, String password) {

		LoginPage signin = PageFactory.initElements(driver, LoginPage.class);
		signin.clickOnYourTrip();
		signin.clickOnSignIn();
		signin.setUsername(username);
		signin.setPassword(password);
		signin.clickOnSignInButton();

	}

	@DataProvider(name = "loginData")
	public Object[][] loginData() {
		return new Object[][] { { "*****", "*****" } };

	}

	// Flight Booking test scenario

	@Test(dataProvider = "flightbooking", priority = 1,enabled=true)
	public void flightBookingTest(String fromcity, String tocity) {

		FlightBookingPage booking = PageFactory.initElements(driver, FlightBookingPage.class);
		booking.fromCity(fromcity);
		booking.toCity(tocity);
		booking.clickOnDate();
		booking.clickSearch();
		booking.clickOnBook();

	}

	@DataProvider(name = "flightbooking")
	public Object[][] flightBooking() {
		return new Object[][] { { "Delhi", "Bangalore" } };

	}
	
	// Flight Booking test scenario

		@Test(dataProvider = "hotelbooking", priority = 2)
		public void hotelBookingTest(String input) {

			HotelBookingPage book = PageFactory.initElements(driver, HotelBookingPage.class);
			book.clickOnHotel();
			book.searchLocation(input);
			book.checkinCheckout();
			
				}
		
		@DataProvider(name = "hotelbooking")
		public Object[][] hotelBooking() {
			return new Object[][] { { "Marathahalli, Bangalore, Karnataka, India" } };

		}
}
