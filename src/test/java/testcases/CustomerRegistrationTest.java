package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageclasses.CommonMenuPageLinks;
import pageclasses.CustomerRegistrationPage;
import pageclasses.LogInPage;

public class CustomerRegistrationTest extends BaseTest {

	@Test
	public void newCustomerRegTest() {

		CommonMenuPageLinks comLinks = new CommonMenuPageLinks(driver);
		comLinks.ClickSignIn();

		LogInPage lp = new LogInPage(driver);
		lp.ClickOnRegisterYourAccount();

		CustomerRegistrationPage crPage = new CustomerRegistrationPage(driver);
		crPage.enterFirstName(new Faker().name().firstName());
		crPage.enterLastName(new Faker().name().lastName());

		Assert.assertEquals(crPage.customerRegistrationHeading(), "Customer registration");
	}

}
