package com.Assignment.TestScriptd;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Assignment.genericUtility.BaseTest;
import com.Assignment.genericUtility.Excel;
import com.Assignment.genericUtility.FileUtility;

import objectRepository.CustomerPage;
import objectRepository.LoginPage;

public class CreateCustomer extends BaseTest {

	@DataProvider(name = "TestData")
	public Object[][] customerData() throws EncryptedDocumentException, IOException {
		return Excel.readMultipleData(excelpath, "Sheet1");
	}

	@Test(dataProvider = "TestData")
	public void createCustomer(String email, String password) throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.loginFunctionality(email, password);
		Thread.sleep(10000);
		CustomerPage cp = new CustomerPage(driver);
		cp.createCustomer(FileUtility.getRandom());
	}

}
