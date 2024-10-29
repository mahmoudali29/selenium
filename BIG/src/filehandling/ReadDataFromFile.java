package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\V.I.P\\eclipse-workspace\\BIG\\src\\filehandling\\test.txt");
		FileReader fr = new FileReader(f);
//		int i = fr.read();
//		
//		while (i!=-1) {
//			System.out.println(i);  /// show ASCII
//			System.out.print((char)i);  /// show the main character
//			i = fr.read();
//		}
		
		BufferedReader br = new BufferedReader(fr);
		String output = br.readLine();
		while (output!=null) {
			System.out.println(output);
			output = br.readLine();
		}
		
		
	}
}
