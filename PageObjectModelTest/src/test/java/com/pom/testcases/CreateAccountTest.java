package com.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.pages.LandingPage;
import com.pom.utility.TestBase;

public class CreateAccountTest extends TestBase {
	String sBrowser="chrome";
	 public WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=initializeBrowser(sBrowser);
		System.out.println("driver from create account test:"+driver);
		
		//driver=new FirefoxDriver();
		enterURL("automationURL");
		LandingPage landingpageobj=new LandingPage(driver);
landingpageobj.CloseWelcomePopup();
}
	

	@Test(description="creating an account with vallid data")
public void At_verify_CreateAccountWithVallid_data(){
}
@Test(description="creating an account with invallid data")
public void At_verify_CreateAccountWithInvallid_data() {

}
}



