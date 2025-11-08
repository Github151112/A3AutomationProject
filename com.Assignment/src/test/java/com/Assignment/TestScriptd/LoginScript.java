package com.Assignment.TestScriptd;

import java.beans.ExceptionListener;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Assignment.genericUtility.BaseTest;
import com.Assignment.genericUtility.Excel;

import objectRepository.LoginPage;

public class LoginScript extends BaseTest{
	
	@DataProvider(name = "TestData")
	public Object[][] loginTestData() throws EncryptedDocumentException, IOException
	{
		return Excel.readMultipleData(excelpath, "Sheet1");
	}
	
	@Test(dataProvider = "TestData")
	public void loginFunctionality(String email,String password) throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.loginFunctionality(email, password);
		Thread.sleep(5000);
		Assert.assertEquals(lp.getDashBoard().isDisplayed(), true);
	}

}
