import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



public class external { /*this will display information to the main class in order to
						override problems of static methods*/
	boolean change_data = false; //used to morph to different data structures
	String filepath = "";
	
	public void menu_display() {
		/*List all the outputs in a single method to prevent redundancy*/
		System.out.println("1: List category of enclosures");
		System.out.println("2: List information pertaining to enclosure suitability");
		System.out.println("3: List all the available cages");
		System.out.println("4: List all available keepers");
		System.out.println("5: List category of animals");
		System.out.println("6: List animal details (animal, cage, and keeper details");
		System.out.println("7: Add an animal to a cage");
		System.out.println("8: Remove an animal from a cage");
		System.out.println("9: Assign a keeper to a cage");
		System.out.println("10: Unassign a keeper to a cage");
		System.out.println("11: Exit and save all current details");	
	
}

	public void indent() {
		System.out.println("");
	}
	
	public void filereader() { /*allow for custom defining the file location*/
		Set<String> match_conditions = new HashSet<String>(); /*this delimator will be used for cross regex checks with the filepath for a string name*/
		match_conditions.add("Keepers");
		match_conditions.add("Cages");
		match_conditions.add("Enclosures");
		match_conditions.add("Animals");
		
		System.out.println("Please define the location of where the file is");
		Scanner file_location = new Scanner(System.in);
		filepath = file_location.nextLine(); 
	
		indent();
		if (!filepath.contentEquals("")) {
			
		System.out.println("Operation completed successfully");
		}
		else {
			System.out.println("There appears to have been an error, please redefine the location of the file");
			file_location.nextLine();
		}
	/*Begin file reader*/
		BufferedReader objReader = null;

		try {
		
		String currentline;
		
		objReader = new BufferedReader(new FileReader(filepath));
		
		while ((currentline = objReader.readLine()) != null) {
			if (currentline.contentEquals(",")) {
				change_data = true;
			System.out.println(currentline);
			}
		
		if (filepath.contains("Cages.txt")) {
			Cages cages = new Cages();
			cages.begin(); /*call method loader based on text file*/
		}
		if (filepath.contains("Animals.txt")) { /*decide what object to load depending on what file is loaded*/
			Animals animals = new Animals();
			animals.begin();
		}
		if (filepath.contains("Keepers.txt")) {
			Keepers keepers = new Keepers();
			keepers.begin();
		}
		if (filepath.contains("Enclosures.txt")) {
			Enclosures enclosures = new Enclosures();
			enclosures.begin();
		}
		
		}
		}catch (IOException e) {
			e.printStackTrace();
			
		
		} 
		finally {
			try {
				if (objReader != null) 
					objReader.close();
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		}
	}

