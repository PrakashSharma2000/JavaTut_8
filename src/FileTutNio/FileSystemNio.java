package FileTutNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemNio {
 
	public static void main(String[] args) {
		
		try {
			Path path = Paths.get("Testtube");
			
			Path donePath=Files.createDirectory(path);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}
}
