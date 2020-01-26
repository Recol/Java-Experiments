import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;





public class external { /*this will display information to the main class in order to
						override problems of static methods*/
	boolean change_data = false; //used to morph to different data structures
	String filepath = "";
	List<String> arr;;
	

	public void menu_display() {
		/*List all the outputs in a single method to prevent redundancy*/
		System.out.println("1: List category of enclosures");
		System.out.println("2: List all the available cages");
		System.out.println("3: List all available keepers");
		System.out.println("4: List details of animals");
		System.out.println("5: List All Details (animal, cage, and keeper details");
		System.out.println("6: Add an animal to a cage");
		System.out.println("7: Remove an animal from a cage");
		System.out.println("8: Assign a keeper to a cage");
		System.out.println("9: Unassign a keeper to a cage");
		System.out.println("10: Exit and save all current details");	
	
}

	public void indent() {
		System.out.println("");
	}
	
	@SuppressWarnings("unchecked")
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
			}
		
		if (filepath.contains("Cages")) {
			Cages cages = new Cages();
			cages.begin(); /*call method loader based on text file*/
		}
		if (filepath.contains("Animals")) {
			Animals animals = new Animals();
			Files.lines(Paths.get(filepath)).forEach((Consumer<? super String>) arr);
			System.out.println(arr.toString());
		}
		if (filepath.contains("Keepers")) {
			Keepers keepers = new Keepers();
			keepers.begin();
		}
		if (filepath.contains("Enclosures")) {
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
	

	
		public String ID_Gen(String generate) { //use this for generating ID's for animal assignments
			int random = (int)Math.ceil(Math.random() * 100);
			String generate_id = generate + random;
			return generate_id;
		}


			public void assignment() {
				String entry = null;
				arr.add(entry);
			}
			
}


