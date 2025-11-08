package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDelhiMetro {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://delhimetrorail.com/");
		Thread.sleep(5000);
		//click on cross button
		WebElement popup = driver.findElement(By.xpath("(//button[@id='buttonDismiss1'])[1]"));
		popup.click();
		Thread.sleep(2000);
		//click on from section
		WebElement from = driver.findElement(By.xpath("//input[@id='FromStation']"));
		from.click();
		Thread.sleep(2000);
		WebElement line2 = driver.findElement(By.xpath("//div[text()='Line 2']"));
		line2.click();
		Thread.sleep(2000);
		WebElement azad = driver.findElement(By.xpath("//font[text()='AZADPUR']"));
		azad.click();

	}

}
