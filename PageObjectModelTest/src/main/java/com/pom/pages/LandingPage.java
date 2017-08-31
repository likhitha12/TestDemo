package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pom.utility.TestBase;

public class LandingPage extends TestBase  {
WebDriver driver;
LandingPage landingpageobj;
public void setUp() {
	enterURL("automationURL");
	landingpageobj=new LandingPage(driver);
}
public LandingPage(WebDriver driver) {
	this.driver=driver;

}
public void CloseWelcomePopup() {
	System.out.println("driver from landing page:::"+driver);
	driver.findElement(By.id("x-button")).click();

}

public void clickRegisterButton() {
driver.findElement(By.xpath("//*[text()='register']")).click();
}
}
