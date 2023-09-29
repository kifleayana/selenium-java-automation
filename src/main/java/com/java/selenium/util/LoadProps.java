package com.java.selenium.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadProps {
	public static String getData(String key) throws IOException {
		String value = null;
		FileReader reader;
		try {
			reader = new FileReader("user.properties");
			Properties prop = new Properties();
			prop.load(reader);

			value = prop.getProperty(key);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return value;
	}
}
