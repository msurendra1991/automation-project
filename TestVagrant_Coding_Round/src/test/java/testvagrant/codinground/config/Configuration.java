package testvagrant.codinground.config;

public class Configuration {

	// Configuration elements
	public static final String testsite = "https://www.cleartrip.com/";

	// Web elements
	// SignIn Page
	public static final String Yourtrips = "//*[@id='userAccountLink']/span[2]";
	public static final String SignIn = "//*[@id='SignIn']";
	public static final String Username = "//form[@id='signinForm']/dl/dd/input";
	public static final String Password = "//form[@id='signinForm']/dl/dd[3]/input";
	public static final String SignInButton = "//button[@id='signInButton']";

	// FlightBookingPage
	public static final String Fromtextbox = "//*[@id='FromTag']";
	public static final String Selectcity = "//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]";
	public static final String Tocity = "//*[@id='ToTag']";
	public static final String Selecttocity = "//a[contains(.,'Bangalore, IN - Kempegowda International Airport (BLR)')]";
	public static final String Departon = "//input[@id='DepartDate']";
	public static final String Selectdate = "//a[contains(.,'24')]";
	public static final String Searchbutton = "//input[@id='SearchBtn']";
	public static final String Book = ".showTabs .booking";
	public static final String BookingConfirm = "body > div.container > header > div.colZero.col12 > p";
	public static final String Cleartrip=".brand > img";
	
	//HotelBookingPage
	public static final String Hotel="//a[contains(text(),'Hotels')]";
	public static final String Wheresearch="//*[@id='Tags']";
	public static final String Selectlocation="//a[contains(.,'Marathahalli, Bangalore, Karnataka, India')]";
	public static final String Checkin="//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[4]/a";
	public static final String Checkout="//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[2]/td[4]/a";
	public static final String Text="//*[@id='Home']/section/div/div/div[1]/h1";

}
