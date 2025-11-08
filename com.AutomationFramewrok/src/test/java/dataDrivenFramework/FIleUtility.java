package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIleUtility {

	static WebDriver driver;

	public static String getDataFromProperty(String path, String key) throws IOException {
		FileInputStream file = new FileInputStream(path);
		Properties p = new Properties();
		p.load(file);
		return p.getProperty(key);
	}

	public static void preCondition(String url, int seconds) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		driver.get(url);
	}

	public static void postCondition() {
		driver.quit();
	}

	public static void loginFunctionality(String userid, String pwdid, String loginname, String username,
			String password) {
		driver.findElement(By.id(userid)).sendKeys(username);
		driver.findElement(By.id(pwdid)).sendKeys(password);
		driver.findElement(By.name(loginname)).click();
	}

}
