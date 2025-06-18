package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageclasses.CommonMenuPageLinks;
import pageclasses.ContactPage;

public class ContactTest extends BaseTest {

	@Test
	public void newContactTestClick() {

		CommonMenuPageLinks contactTestClick = new CommonMenuPageLinks(driver);
		contactTestClick.ContactClick();
		

		ContactPage conPage = new ContactPage(driver);
		conPage.enterFirstName(new Faker().name().firstName());
		conPage.enterLastName(new Faker().name().lastName());
		conPage.enterEmailAddress(new Faker().internet().emailAddress());
		//conPage.SelectSubject();
		conPage.enterMessage(new Faker().lorem().sentence());
		
		contactTestClick.ClickHomeTab();
		
		Assert.assertEquals(conPage.HomePageFirstElement(),"Combination Pliers");
		
	}

}
