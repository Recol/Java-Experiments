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
		
			set_Cage_ID(object.ID_Gen("GC"));
			set_Cage_Size(si);
			set_Cage_Type("Null");
			set_Max_Animals(max_A);
			set_Max_Keepers(max_K);
		}while (!option.equals("E"));
		return cage;
	}
	
	
	public void assign_Animal(Cages cage, Animals animal_enc) {
		Scanner input = new Scanner(System.in);
		if(animals_caged.size() >= get_Max_Animals()) {
			System.err.println("This cage is full");
		} else if(cage.animals_caged.contains(animal_enc)){
			System.err.println("This animal is already present in this cage");
		} else if(!external.validateCageType(cage, animal_enc)) {
			System.err.println("This animal is incompatible for this cage");
		} else {
			cage.cagedAnimals.add(animal);
			if(cage.getCageType().equals("None")) {
				cage.defineCageType(cage, animal);
			}
			animal.setCageAssignment(cage.getCageId());
			System.out.println(animal.getAnimalName() + " the " + animal.getAnimalSpecies() + " was successfully added to cage " + cage.getCageId());
		}
	}
	
	/*
	 * Define Cage Type method
	 * Takes Cage and Animal object as parameters
	 * Checks if species can share
	 * If they can share, set type to species1 and species2
	 * If not, set type to species
	 */
	public void defineCageType(Cage cage, Animal animal) {
		if(animal.getAnimalSpecies().equals("Zebra") || animal.getAnimalSpecies().equals("Marmoset-Monkey")) {
			cage.setCageType("Zebras and Marmoset Monkeys");
		} else if(animal.getAnimalSpecies().equals("Rabbit") || animal.getAnimalSpecies().equals("Guinea-Pig")) {
			cage.setCageType("Rabbits and Guinea Pigs");
		} else if(animal.getAnimalSpecies().equals("Horse") || animal.getAnimalSpecies().equals("Donkey")) {
			cage.setCageType("Horses and Donkeys");
		} else if(animal.getAnimalSpecies().equals("Bearded-Dragon") || animal.getAnimalSpecies().equals("Lizard")) {
			cage.setCageType("Bearded Dragons and Lizards");
		} else {
			cage.setCageType(animal.getAnimalSpecies() + "s");
		}
	}
	
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
	

	public String get_Cage_ID() {
		return cage_ID;
	}

	public void set_Cage_ID(String cage_ID) {
		this.cage_ID = cage_ID;
	}

	public String get_Cage_Size() {
		return cage_Size;
	}

	public void set_Cage_Size(String cage_Size) {
		this.cage_Size = cage_Size;
	}

	public String getCageType() {
		return cage_Type;
	}

	public void set_Cage_Type(String cage_Type) {
		this.cage_Type = cage_Type;
	}

	public int get_Max_Animals() {
		return max_Animals;
	}

	public void set_Max_Animals(Integer max_Animals) {
		this.max_Animals = max_Animals;
	}

	public int get_Max_Keepers() {
		return max_Keepers;
	}

	public void set_Max_Keepers(Integer max_Keepers) {
		this.max_Keepers = max_Keepers;
	}

	public LinkedList<Animals> get_Caged_Animals() {
		return animals_caged;
	}

	public void set_Caged_Animals(LinkedList<Animals> animals_caged) {
		this.animals_caged = animals_caged;
	}

	public LinkedList<Keepers> get_Caged_Keepers() {
		return keepers_caged;
	}

	public void set_Caged_Keepers(LinkedList<Keepers> keepers_caged) {
		this.keepers_caged = keepers_caged;
	}
}


