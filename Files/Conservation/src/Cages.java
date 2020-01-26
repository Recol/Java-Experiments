import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;





public class Cages {
	String external_location = "";
	private String cage;
	private String cage_ID;
	private String cage_Size;
	private String cage_Type;
	private int max_Animals;
	private int max_Keepers;
	private LinkedList<Animals> animals_caged;
	private LinkedList<Keepers> keepers_caged;
	external object = new external();

	public Cages() {
		keepers_caged = new LinkedList<Keepers>();
		animals_caged = new LinkedList<Animals>();
		
	
	
	}
	public void file_external_path() { /*So since the data is being cross-called, there requires a way to refresh the changing file location, this method will do this.*/
		String file_location = "";
		 external_location = object.filepath; /*load in the directory file declared before into a string*/
	}
	public void begin() throws IOException {
	file_external_path(); /* so call in order to process the string for loading into a data structure*/
	}
		
	
 /*load the file into the list*/
	/**
	 * Due to the usage of an object String in the switch case, catching exceptions will not be required here.
	 * This is because the software will not advance without declared options from the Scanner, and will ignore erroneous entries.
	 * @param cage
	 * @return
	 * @throws InterruptedException
	 */
	@SuppressWarnings("unlikely-arg-type")
	public Cages new_cage(Cages cage) throws InterruptedException {
		Integer max_A = 0;
		String si = "";
		Integer max_K = 0;
		String option;
		
		Scanner input = new Scanner(System.in);
		cage_menu();
		System.out.println("Please input your menu choice, or alternatively press E to exit");
		
		do {
	
			option = input.nextLine();
			switch (option) {
			case "1":
				System.out.println("Small cage");
				max_A = 2;
				max_K = 1;
				si = "Small";
				break;
			case "2":
				System.out.println("Medium cage");
				max_A = 4;
			max_K = 2;
			si = "Medium";
			break;
			case "3": 
				System.out.println("Large cage");
				max_A = 8;
				max_K = 3;
				si = "Large";
				break;
			case "4":
				System.out.println("X-Large Cage");
				max_A = 16;
				max_K = 4;
				break;
			}
		
			
		}while (!option.equals("E"));
		return cage;
	}
	
	

	
		/*
		 * Cage menu for outputs
		 */
	public void cage_menu() throws InterruptedException {
		System.out.println("");
		System.out.println("The following is a representation in an A and K format, each representing animals and keepers");
		System.out.println("");
		Thread.sleep(1000);
		System.out.println("1: Small (4A/1K");
		System.out.println("2: Medium (4A/2K");
		System.out.println("3: Large (8A/3K");
		System.out.println("4: X-Large (16A/4K");
	}
	

}


