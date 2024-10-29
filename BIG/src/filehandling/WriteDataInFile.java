package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInFile {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\V.I.P\\eclipse-workspace\\BIG\\src\\filehandling\\test.txt");
		FileWriter fw= new FileWriter(f,true);
		//fw.write("welcome");  /// overwrite
		fw.write("\n welcome");  /// append
		fw.flush();
		fw.close();
	}
}
