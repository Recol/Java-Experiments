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
		/**
		 * Afterwards, the respective file will be loaded in according to the set conditions are matched with the name of the text file.
		 */
		System.out.println("Please define the location of where the file is");
		Scanner file_location = new Scanner(System.in);
		filepath = file_location.nextLine(); 
	/**
	 * Call the next line entry scanner input for the declared text file diretory location.
	 */
		indent();
		if (!filepath.contentEquals("")) {
			/*if the string contains the set conditions anywhere in the string*/
		System.out.println("Operation completed successfully");
		}
		else {
			System.out.println("There appears to have been an error, please redefine the location of the file");
			file_location.nextLine();
		}
		/*catch any input which does not match the set conditon*/
	/*Begin file reader*/
		BufferedReader objReader = null;

		try {
		
		String currentline;
		
		objReader = new BufferedReader(new FileReader(filepath));
		/**
		 * open a filereader object with the declared string location, specifying the text file location
		 */
		while ((currentline = objReader.readLine()) != null) {
			if (currentline.contentEquals(",")) {
				change_data = true;
			}
			/**
			 * Open a boolean for further expansion, whereby files can be written on the stream ethereally.
			 */
		if (filepath.contains("Cages")) {
			Cages cages = new Cages();
			cages.begin(); /*call method loader based on text file*/
		}
		if (filepath.contains("Animals")) {
			Animals animals = new Animals();
			animals.begin();
		}
		if (filepath.contains("Keepers")) {
			Keepers keepers = new Keepers();
			keepers.begin();
		}
		if (filepath.contains("Enclosures")) {
			Enclosures enclosures = new Enclosures();
			enclosures.begin();
		}
		
		
		/*
		 * A charsequence is used here to cross-compare a set value, as it is not a string by default, potentially loading casting exceptions
		 * by simply declaring a string condition.
		 */
		else if (!filepath.contains((CharSequence) match_conditions)) { /*cast char sequence to match search*/
			System.out.println("No file has been located.");
			System.out.println("Please re-run the program again, ensuring that you have defined the correct filepath location.");
			System.exit(0);
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
	
	public static boolean validate_Cage_Type(Cages cage, Animals animal) {
		if(cage.getCageType().equals("None")) {
			return true;
		} else if(animalCompatibility(cage.getCageType(), animal.get_Animal_Species())) {
			return true;
		}
		return false;
	}
	/**
	 * Utilise a boolean to prevent cross-checking cage compatibility, and simply call if the value is true or not in other classes.
	 * E.g. (if validate_Cage_Type == true {
	 * do {
	 * (logic)
	 * }}
	 * @param generate
	 * @return
	 */
		public String ID_Gen(String generate) { //use this for generating ID's for animal assignments
			int random = (int)Math.ceil(Math.random() * 100);
			String generate_id = generate + random;
			return generate_id;
		}
}
			/**
			 * Generate the math.ceil method as a primitive int, and generate a random number multiplied by 100.
			 * Afterwards, combine the generation with the declared returned String entry from other classes, then return the ID.
			 */


