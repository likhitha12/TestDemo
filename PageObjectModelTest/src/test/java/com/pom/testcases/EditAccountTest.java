package com.pom.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.utility.TestBase;

public class EditAccountTest extends TestBase {
	WebDriver driver;
	String sBrowser="chrome";
	@BeforeMethod
	public void setUp() {
		driver=new FirefoxDriver();
	initializeBrowser(sBrowser);
	enterURL("automationURL");
	}
	
		
	
	@Test(description="edit an account with vallid data")
	public void At_verify_EditAccountWithVallid_data(){
	}
	@Test(description="edit an account with invallid data")
	public void At_verify_EditAccountWithInvallid_data() {
	}
	}


