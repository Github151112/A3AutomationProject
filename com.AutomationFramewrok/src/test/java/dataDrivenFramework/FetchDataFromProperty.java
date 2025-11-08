package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromProperty {
	
	static String path = "./src/main/resources/TestData/Data.properties";
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(path);
		Properties p = new Properties();
		p.load(file);
		String url = p.getProperty("Stage");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		
	}

}
