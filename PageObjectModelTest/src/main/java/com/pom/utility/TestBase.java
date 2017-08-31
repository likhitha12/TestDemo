package com.pom.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase implements SetUp {
WebDriver driver;
	public WebDriver initializeBrowser(String sBrowser) {
	if(sBrowser.equalsIgnoreCase("firefox")) {
	System.setProperty("CHROMEKEY","CHROMEPATH");
	driver=new FirefoxDriver();
	enterURL("automationURL");
}else if(sBrowser.equalsIgnoreCase("chrome")); 
System.setProperty("CHROMEKEY","CHROMEPATH");
driver=new ChromeDriver();
System.out.println("Driver From TestBase:::"+driver);
return driver;
	
	}
public void enterURL(String URL) {
	driver.get("set URL");
}
}