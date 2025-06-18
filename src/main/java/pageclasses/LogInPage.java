package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By RegisterAccount=By.xpath("//a[text()='Register your account']");
	
	public void ClickOnRegisterYourAccount() {
		driver.findElement(RegisterAccount).click();
	}

}
