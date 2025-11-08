package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
	
	public CustomerPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//span[text()='My Customers']")
	private WebElement myCustomer;
	
	@FindBy(xpath = "//span[text()=' New Customer ']")
	private WebElement newCustomer;
	
	@FindBy(xpath = "//input[@formcontrolname='LeadName']")
	private WebElement leadNameTextField;
	
	@FindBy(xpath = "//span[text()=' Save ']")
	private WebElement saveButton;
	
	public void createCustomer(String leadName) throws InterruptedException
	{
		myCustomer.click();
		Thread.sleep(5000);
		newCustomer.click();
		Thread.sleep(5000);
		leadNameTextField.sendKeys(leadName);
		Thread.sleep(5000);
		saveButton.click();
		
	}

}
