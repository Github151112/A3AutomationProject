package com.Assignment.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;

	@BeforeClass
	public void launchBrowser() throws IOException {
		String browser = FileUtility.readProperty(path, "browser");
		String url = FileUtility.readProperty(path, "url");
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equals("edge"))
			driver = new EdgeDriver();
		else
			System.out.println("invalid browser");
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
