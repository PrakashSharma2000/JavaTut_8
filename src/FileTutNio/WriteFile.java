package FileTutNio;

import java.nio.file.*;

public class WriteFile {
	public static void main(String[] args) {
		try {
			Path path = Paths.get("TestDir");
			
			Files.createDirectories(path);
			
			Path p = Paths.get("TestDir/test.txt");
			Files.createFile(p);
			
			String teststr = """
					This is a test file.
					Hurry!!!
					""";
			
			Files.writeString(p, teststr);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
