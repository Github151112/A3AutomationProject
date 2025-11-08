package LearningPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindAll({@FindBy(id = "emai"),@FindBy(name = "em"),@FindBy(xpath = "//input[@placeholder='Email address or phone number']")})
	private WebElement emailTextField;

	@FindBy(id = "pass")
	private WebElement passwordTextField;
	
	@FindBy(name = "login")
	private WebElement loginButton;
	
	public WebElement getemailTextField()
	{
		return emailTextField;
	}
	

}
