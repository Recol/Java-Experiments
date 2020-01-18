import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Keepers {
	private String keeper_Id;
	private String first_Name;
	private String last_Name;
	private ArrayList<String> cage_Assignment;
	
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
	}
	
	
	
	
	public void keeper_details() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first name of the keeper");
		set_First_Name(input.nextLine());
		System.out.println("Please enter the second name of the keeper");
		set_Last_Name(input.nextLine());
		set_Keeper_ID(external_object.ID_Gen("Keeper"));
		
	}
	
	
	
	 */
	public String get_Keeper_ID() {
		return keeper_ID;
	}

	public void set_Keeper_ID(String keeper_ID) {
		this.keeper_ID = keeper_ID;
	}

	public String get_First_Name() {
		return first_Name;
	}

	public void set_First_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String get_Last_Name() {
		return last_Name;
	}

	public void set_Last_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public ArrayList<String> get_Cage_Assignment() {
		return cage_Assignment;
	}

	public void setCageAssignment(ArrayList<String> cage_Assignment) {
		this.cage_Assignment = cage_Assignment;
	}
}

	
	
	

