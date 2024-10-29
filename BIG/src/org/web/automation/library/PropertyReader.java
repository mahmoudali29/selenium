package org.web.automation.library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String applicationConfigReader(String key) {
		Properties prob = new Properties();
		try {
			File f = new File("./config/config.properties");
			FileReader fr = new FileReader(f);
			
			prob.load(fr);
			return prob.get(key).toString();
		} catch (Exception e) {
			return null;
		}
	}
	
	 
}
