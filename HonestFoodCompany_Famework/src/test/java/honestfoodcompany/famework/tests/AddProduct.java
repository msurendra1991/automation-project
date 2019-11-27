package honestfoodcompany.famework.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import honestfoodcompany.famework.pages.MamacitaBrandPage;
import honestfoodcompany.famework.testbase.TestBase;

public class AddProduct extends TestBase {

	@Test(dataProvider = "AddressData")
	public void userSignInTest(String inputdata) {

		MamacitaBrandPage addproduct = PageFactory.initElements(driver, MamacitaBrandPage.class);
		addproduct.clickOnCookiepolicy();
		addproduct.clickOnMamacita();
		addproduct.addressInput(inputdata);
		addproduct.clickOnSubmit();

	}

	@DataProvider(name = "AddressData")
	public Object[][] users14ViewIdAndData15Dece() {
		return new Object[][] { { "Semperstraße 44, 1180 Wien, Austria" } };

	}

}
