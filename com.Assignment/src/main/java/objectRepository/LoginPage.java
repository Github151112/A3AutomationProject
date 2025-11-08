package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Email Id / Mobile No']")
	private WebElement emailTextField;

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement passwordTextField;

	@FindBy(id = "kt_login_signin_submit")
	private WebElement loginButton;

	@FindBy(xpath = "//h3[text()='Dashboard']")
	private WebElement dashBoard;

	public WebElement getDashBoard() {
		return dashBoard;
	}

	public void loginFunctionality(String username, String password) {
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

}
