package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.log4testng.Logger;

public class HomePage{
	
		WebDriver driver;
		//static Logger log=Logger.getLogger(HomePage.class.getName());
	
	//@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInButton=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickOnSignInButton(){
		signInButton.click();
		System.out.println("clicked on signIn Button:)");
	}

}
