package FileTutNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		try {
			Path path= Paths.get("Shampy.txt");
			
			List<String> data = Files.readAllLines(path);
			
			System.out.println(data);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
