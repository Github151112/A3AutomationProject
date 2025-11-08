package selectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public static void precondition(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void postCondition()
	{
		driver.quit();
	}
	
	public static void selectOptions(WebElement dropdown,String text)
	{
		Select s = new Select(dropdown);
		s.selectByVisibleText(text);
	}
	
	

}
