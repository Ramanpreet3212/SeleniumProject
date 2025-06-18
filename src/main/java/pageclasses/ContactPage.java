package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class ContactPage {

	WebDriver driver;

	public ContactPage(WebDriver driver) {

		this.driver = driver;
	}

	By firstName = By.id("first_name");
	By lastName = By.id("last_name");
	By emailAddress = By.id("email");
	By selectOption = By.id("subject");
	By payments = By.xpath("//option[text()='Payments']");
	By messageText = By.id("message");
	By homeFirstElement =By.xpath("//h5[text()=' Combination Pliers ']");

	public void enterFirstName(String firstNaam) {
		driver.findElement(firstName).sendKeys(firstNaam);

	}

	public void enterLastName(String lastNaam) {
		driver.findElement(lastName).sendKeys(lastNaam);

	}

	public void enterEmailAddress(String EmailAdd) {
		driver.findElement(emailAddress).sendKeys(EmailAdd);

	}

	
	 /* public void SelectSubject() { WebElement dropDownEle =
	  driver.findElement(selectOption); Select dropDownOption = new Select(dropDownEle); 
	  WebElement payment = driver.findElement(payments);
	  dropDownOption.deselectByVisibleText("payment");
	  
	  }*/
	 
	public void enterMessage(String messaage) {
		driver.findElement(messageText).sendKeys(messaage);

	}
	
	public String HomePageFirstElement() {
		return driver.findElement(homeFirstElement).getText();
		
	}

}
