package FileTutNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("Testtube/testFile.txt");
			
			Path p = Files.createFile(path);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
