package FileTut;
import java.io.*;
public class FileIOTut {
/**
 * @param args
 * @throws IOException
 */
public static void main(String[] args) throws IOException {
	
	//File writer
//	 try (FileWriter writer = new FileWriter("Shampy.txt")){
//
//         String str = """
//         		This is a test for block.
//         		Here i am writting it like a file.
//         		This is a next line.
//         		Let's test.
//         		""";
//        
//         writer.flush();
//         writer.write(str);
//         writer.close();
//         
//         System.out.println(
//             "Data written to the file successfully.");
//     }
//
//     catch (IOException e){
//         
//         System.out.println(
//             "An error occurred while writing"
//             + " to the file: " + e.getMessage());
//     }
	 
	FileReader fr = new FileReader("Shampy.txt");
	
	while(fr.ready()) {
		System.out.print((char)fr.read());
	}
	fr.close();
}
}
