package com.Assignment.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class FileUtility {
	
	public static String readProperty(String path,String key) throws IOException
	{
		FileInputStream file = new FileInputStream(path);
		Properties p = new Properties();
		p.load(file);
		return p.getProperty(key);
	}
	
	public static String getRandom()
	{
		Random r = new Random();
		int no = r.nextInt(1000);
		String name  = "naw"+no+"+az";
		return name;
		
	}

	
}
