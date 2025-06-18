package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerRegistrationPage {

	WebDriver driver;

	public CustomerRegistrationPage(WebDriver driver) {
		this.driver = driver;

	}

	By firstNameId = By.id("first_name");
	By lastNameId = By.id("last_name");
	By tag = By.tagName("h3");

	public void enterFirstName(String firstName) {

		driver.findElement(firstNameId).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {

		driver.findElement(lastNameId).sendKeys(lastName);
	}

	public String customerRegistrationHeading() {

		return driver.findElement(tag).getText();

	}

}
