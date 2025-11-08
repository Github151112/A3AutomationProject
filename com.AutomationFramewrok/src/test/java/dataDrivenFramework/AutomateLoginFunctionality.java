package dataDrivenFramework;

import java.io.IOException;

public class AutomateLoginFunctionality {
	static String path = "./src/main/resources/TestData/Data.properties";

	public static void main(String[] args) throws IOException, InterruptedException {
		String url = FIleUtility.getDataFromProperty(path, "url");
		String username = FIleUtility.getDataFromProperty(path, "email");
		String password = FIleUtility.getDataFromProperty(path, "password");
		FIleUtility.preCondition(url, 10);
		FIleUtility.loginFunctionality("email", "pass", "login", username, password);
		FIleUtility.postCondition();

	}

}
