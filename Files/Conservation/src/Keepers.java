import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author deckl
 *
 */
public class Keepers {
	private String keeper_Id;
	private String first_name;
	private String last_name;
	private ArrayList<String> cage_Assignment;
	private String cage_ID;
	boolean check_found = false;
	String enclosure_ID;
	
	File_IO file_runner = new File_IO();
	external external_object = new external();
	
	public Keepers() {
		cage_Assignment = new ArrayList<>();
	}
	
	String external_location = "";
	public void file_external_location() {
		String file_location = "";
		external object = new external();
		 external_location = object.filepath; /*load in the directory file declared before into a string*/
	}
	/**
	 * @throws IOException
	 */
	public void begin() throws IOException {
		file_external_location(); /* so call in order to process the string for loading into a data structure*/
	try {
		
	
	List<String> lines = Files.readAllLines(Paths.get(external_location)); /*load the file into the list*/
	}
	catch (IOException e) {
	e.getStackTrace();	
	}}
	
	
	public Keepers newKeepers(Keepers keeper) {
		keeper_details();
		
		return keeper;
	}
	
	
	/*
	 * This method will run the initialisation for adding a new keeper to a cage, run the File_IO max allocation cage check, then add or not accordingly.
	 * If the maximum has not been reached, then a string is outputted to be written to the Keepers.txt file using the writeKeeperData() in the File_IO class.
	 */
	public void keeper_details() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the cage ID you would like to add them to?");
		cage_ID = input.nextLine();
		System.out.println("What is the enclosure ID?");
		enclosure_ID = input.nextLine();
		System.out.println("What is the first name of the keeper?");
		first_name = input.nextLine();
		System.out.println("What is the second name of the keeper?");
		last_name = input.nextLine();
		try {
			file_runner.check_max_cage_assignment(cage_ID);
		} catch (Exception e) {
			System.out.println("A fatal error has occurred");
			e.printStackTrace();
		}
		
		if (check_found == false) {
			System.out.println("The maximum amount has not been reached");
			String collective = (cage_ID + "," + enclosure_ID + "," + first_name + "," + last_name);
			File_IO.writeKeeperData(collective);
		}
		else if (check_found == true) {
			System.out.println("The maximum amount of keepers has been reached for this cage.");
			keeper_details();
		}
		}
	
	
	/*
	 * Filter by second name to identify a unique entry, or remove all assocations.
	 */
	public void remove_keeper() throws IOException {
		
		String second_entry = "";
		Scanner input = new Scanner(System.in);
		System.out.println("What is the second name of the keeper?");
		second_entry = input.nextLine();
		File_IO.removeKeeper(second_entry);
	}
	
}

	
	
	

