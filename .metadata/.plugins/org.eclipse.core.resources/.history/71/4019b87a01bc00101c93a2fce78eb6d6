package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		BaseClass.precondition("https://www.facebook.com");
		BaseClass.driver.findElement(By.linkText("Create new account")).click();
		WebElement dayDropdown = BaseClass.driver.findElement(By.id("day"));
		BaseClass.selectOptions(dayDropdown,"15");
		WebElement monthDropdown = BaseClass.driver.findElement(By.id("month"));
		BaseClass.selectOptions(monthDropdown,"Nov");
		WebElement yearDropdown = BaseClass.driver.findElement(By.id("year"));
		BaseClass.selectOptions(yearDropdown,"1996");
		Thread.sleep(5000);
		BaseClass.postCondition();
		
	}

}
