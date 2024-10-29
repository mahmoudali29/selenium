package properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
	public static void main(String[] args) throws IOException {
		ReadFromProperties obj = new ReadFromProperties();
		obj.fetchproperties("Email");
	}
	
	public void fetchproperties(String key) throws IOException {
//		System.out.print("welcome");
		Properties prob = new Properties();
		File f = new File("./config/config.properties");
		FileReader fr = new FileReader(f);
		prob.load(fr);
		System.out.print(prob.get(key));
	}
	
}
