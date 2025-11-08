package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnabled {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement textField = driver.findElement(By.id("email"));
		if(textField.isEnabled())
			textField.sendKeys("ygtfrgthyjukiljhg");
		else
			System.out.println("webelement is disabled");
	}

}
