import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Enclosures {
	public Enclosures() {}
	String enclosure_size;
	
	
	String external_location = "";
	public void file_external_location() {
		String file_location = "";
		external object = new external();
		 external_location = object.filepath; /*load in the directory file declared before into a string*/
	}
	public void begin() throws IOException {
		file_external_location(); /* so call in order to process the string for loading into a data structure*/



	}

	/*
	 * When adding new enclosures, float to a string for parsing to write to the File_IO class.
	 */
	public void new_enclosure() {
		Integer data = 0;
		try {
		Scanner enc = new Scanner(System.in);
		System.out.println("Please enter the enclosure size");
		data = enc.nextInt();
		if (data > 8) {
			System.out.println("The enclosure may not go above this amount");
		}
			else if (data < 8) {
			enclosure_size = data.toString();	
		}
		}catch (NumberFormatException e) {
			System.out.println("A number error has occurred");
			e.getCause();
			new_enclosure();
		}
	}
}