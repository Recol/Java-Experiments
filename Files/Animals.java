import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;



public class Animals {
	
	
	private String animal_Name;
	private String animal_ID;
	private String animal_Family;
	private String animal_Species;
	private String cage_ID;
	HashMap<String, Integer >animal_storage = new HashMap<String, Integer>();
	boolean danger = false;
	external object = new external();
		File_IO opener = new File_IO();
	
	public Animals () {}
	String external_location = "";
	public void file_external_location() {
		
		
		 this.external_location = object.filepath; /*load in the directory file declared before into a string*/
	}
	
	/*Receiver to handle boolean changes with the danger rating.
	 * 
	 */
	public void danger(boolean danger) {
		this.danger = danger;
	}
	
	public void begin() throws IOException {
		 /* so call in order to process the string for loading into a data structure*/
	file_external_location();
	}
	
	/**
	 *Load data into the hashmap, for future expansion, declare danger ratings manually.
	 * 
	 */
	
	
	/*
	 * Method to assign danger ratings respectively to each animal.
	 * Store in a HashMap for implementation if desired for loading instead.
	 */
	
	public void animal_compatibility() {
		String crocodile = "";
		String penguin = "";
		String tiger = "";
		String zebra = "";
		String ape = "";
		String marmoset_monkey = "";
		String snake = "";
		String donkey = "";
		
		String entry = "";
		
		animal_storage.put(crocodile, 3);
		animal_storage.put(penguin, 1);
		animal_storage.put(snake, 3);
		animal_storage.put(donkey, 2);
		animal_storage.put(tiger, 5);
		animal_storage.put(zebra, 3);
		animal_storage.put(ape, 4);
		animal_storage.put(marmoset_monkey, 3);
		Derived d = new Derived();
		d.animal_compatibility();
		
		if (animal_Species.equals("Crocodile")) {
			entry = "3";
		}
			if (animal_Species.equals("Penguin")) {
				entry = "1";
				if (animal_Species.equals("Snake")) {
					entry = "3";
					if (animal_Species.equals("Donkey")) {
						entry = "2";
						if (animal_Species.equals("Tiger")) {
							entry = "5";
							if (animal_Species.equals("Zebra")) {
								entry = "3";
								if (animal_Species.equals("Ape")) {
									entry = "4";
									if (animal_Species.equals("Marmoset Donkey")) {
										entry = "3";
									
								}
							}
							
						}
					}
				}
			}	
		}
			try {
				opener.check_animal_compatibility(entry);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	/*
	 * Method used to create a new animal, strings are collected for output to File_IO.
	 */
	public void new_Animal() {
	Scanner input = new Scanner(System.in); 
	System.out.println("Please enter the animal family:");
	System.out.println("Mammal");
	System.out.println("Reptile");
		animal_Family = input.nextLine();	
	do {
		
		System.out.println("An invalid category has been entered, please enter it again");
		animal_Family = input.nextLine();
		
		if (animal_Family.equals("Mammal") || animal_Family.equals("Reptile")) {
			break;
		}
	}while (!animal_Family.equals("Mammal") || !animal_Family.equals("Reptile"));
	
		if (animal_Family.equals("Mammal")) {
			mammal_selector();
			
		}
		
		if (animal_Family.equals("Reptile")) {
			reptile_selector();
			
		}
	
	System.out.println("Please enter the cage ID");
		cage_ID =input.nextLine();
		System.out.println("Please enter the animal ID");
		animal_ID = input.nextLine();
		animal_compatibility();
		send_animal();
		System.out.println("Successfully added");
	}
	/*
	 * Class used to assign animals, to load all the objects
	 */
	public void send_animal() {
		animal_compatibility();
		
		String collective = (cage_ID + "," + animal_ID + "," + animal_Family + "," + animal_Species);
		File_IO.writeAnimalData(collective);
	}
	
	
	public void reptile_selector() {
		Scanner reptile = new Scanner(System.in);
		System.out.println("Please type one of the following reptiles");
		System.out.println("Snake");
		System.out.println("Bearded Dragon");
		System.out.println("Lizard");
		System.out.println("Crocodile");
		animal_Species = reptile.nextLine();
		
		if (animal_Species.equals("Snake") || animal_Species.equals("Bearded Dragon") || animal_Species.equals("Lizard") || animal_Species.equals("Crocodile")) {
			System.out.println("Assigned.");
			animal_Species = reptile.nextLine();
		}
		else if (!animal_Species.equals("Snake") || !animal_Species.equals("Bearded Dragon") || !animal_Species.equals("Lizard") || !animal_Species.equals("Crocodile")) {
			System.out.println("Invalid choice, please try again.");
			animal_Species = reptile.nextLine();
		}
	}
	
	
	public void mammal_selector() {
		Scanner mammal = new Scanner(System.in);
		System.out.println("Please type one of the following mammals");
		System.out.println("Zebra");
		System.out.println("Marmoset Monkey");
		System.out.println("Ape");
		System.out.println("Rabbit");
		animal_Species = mammal.nextLine();
		
		if (animal_Species.equals("Zebra") || animal_Species.equals("Marmoset Monkey") || animal_Species.equals("Ape") || animal_Species.equals("Rabbit")) {
			System.out.println("Assigned.");
			animal_Species = mammal.nextLine();
		}
		else if (!animal_Species.equals("Zebra") || !animal_Species.equals("Marmoset Monkey") || !animal_Species.equals("Ape") || !animal_Species.equals("Rabbit")) {
			System.out.println("Invalid choice, please try again.");
			animal_Species = mammal.nextLine();
		}
		}
	}

