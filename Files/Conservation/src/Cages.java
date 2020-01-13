import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cages {
	String external_location = "";
	public Cages() {
	}
	
	public void begin() throws IOException {
		 /* so call in order to process the string for loading into a data structure*/
		Scanner input = new Scanner(System.in);
		System.out.println("Please define the location of the file");
		external_location = input.nextLine();
		
		if (external_location.contains("Cages")) {
	load_file();
		}
		else {
			System.out.println("The defined location does not match the required file, please re-define it");
			external_location = input.nextLine();
		}
	}
	public void load_file() {
		ArrayList<String> arraylist = new ArrayList<>();
		try (Scanner s = new Scanner(new File(external_location)).useDelimiter("\\s*,\\s*")) {
		    // \\s* in regular expressions means "any number or whitespaces".
		    // included the whitespaces as part of the data it extracted.
		    while (s.hasNext()) {
		        arraylist.add(s.next());
		    }
		}
	
		
		catch (IOException e) {
			System.out.println("A fatal error has occurred, aborting program.");
			e.getCause();
			e.getStackTrace();
			System.exit(0);
		}
		
		    }
	}

	

