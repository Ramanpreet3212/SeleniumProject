package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.BaseUtils;

public class BaseTest {

	WebDriver driver;

	@BeforeMethod
	public void myinit() throws IOException {

		String browser = BaseUtils.getConfigvalue("browser");

		switch (browser) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("no browser exist");
			break;

		}

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigvalue("implicitwait"))));
		driver.manage().window().maximize();
		driver.navigate().to(BaseUtils.getConfigvalue("url"));
	}

	@AfterMethod
	public void endTest() {
		driver.quit();
	}

}
