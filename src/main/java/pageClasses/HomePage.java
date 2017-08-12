package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePage {
	
	
	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInButton;
	
	
	
	
	
	@Test
	public void clickOnSignInButton(){
		signInButton.click();
	}

}
