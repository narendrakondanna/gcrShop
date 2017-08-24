package pageClasses;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import testBase.TestBase;

public class HomePage extends TestBase{
	
	
	//@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInButton=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
	
	
	
	
	
	
	public void clickOnSignInButton(){
		signInButton.click();
		System.out.println("clicked on signIn Button:)");
	}

}//initElements
