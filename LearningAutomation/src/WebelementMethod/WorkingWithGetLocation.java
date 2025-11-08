package WebelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetLocation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		
		
		WebElement element = driver.findElement(By.xpath("(//h4[text()='Eternal'])[2]"));
		Point xy = element.getLocation();
		System.out.println(xy.getX());
		System.out.println(xy.getY());
		

	}

}
