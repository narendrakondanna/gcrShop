package homePage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageClasses.HomePage;
import testBase.TestBase;

public class VerifyLogIn extends TestBase {

	HomePage homepage;

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		init();
	}

	@Test
	public void verifyLogIn() {
		homepage = new HomePage(driver);
		homepage.clickOnSignInButton();
	}

	@AfterMethod
	public void teardown() {
		//closeBrowser();
	}

}
