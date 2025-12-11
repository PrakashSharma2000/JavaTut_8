package FileTutNio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
	public static void main(String[] args) {
		Path source = Paths.get("Shampy.txt");
		
		Path destination = Paths.get("TestDir/Pasted.txt");
		
		try {
//			Files.copy(source, destination); // simply copies but fails if data already exist
			
			Files.copy(source,destination,StandardCopyOption.REPLACE_EXISTING); // Simply replace file.
			//if you write move instead of copy it will move file;
			
			
					
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
