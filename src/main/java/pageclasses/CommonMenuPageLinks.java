package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMenuPageLinks {

	WebDriver driver;

	public CommonMenuPageLinks(WebDriver driver) {
		this.driver = driver;

	}

	By SignIn = By.xpath("//a[text()='Sign in']");
	By Contact = By.xpath("//a[text()='Contact']");
	By HomeTab = By.xpath("//a[text()='Home']");

	public void ClickSignIn() {
		driver.findElement(SignIn).click();
	}

	public void ContactClick() {
		driver.findElement(Contact).click();

	}

	public void ClickHomeTab() {
		driver.findElement(HomeTab).click();

	}

}
