package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("sdfg@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hgfcdxsfgh");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		System.out.println(errorMsg.getText());
		if (errorMsg.isDisplayed())
			System.out.println("test script is passs");
		else
			System.out.println("test script is fail");
	}
}
