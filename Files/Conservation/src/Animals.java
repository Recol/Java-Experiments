import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Animals {
	
	private String animal_ID;
	private String animal_Name;
	private String animal_Sex;
	private String animal_Family;
	private String animal_Species;
	private String cage_Assignment;
	external object = new external();
	
	public Animals () {}
	String external_location = "";
	public void file_external_location() {
		String file_location = "";
		
		 this.external_location = object.filepath; /*load in the directory file declared before into a string*/
	}
	public void begin() throws IOException {
		 /* so call in order to process the string for loading into a data structure*/
	file_external_location();
	}
	
	/**
	 *This is used to generate and encapsulate passable animal details into a single object.
	 *So, the Animal species family, name, sex and  cage assignment.
	 * @param animal_enc
	 * @return
	 */
	
	public Animals new_Animal(Animals animal_enc) {
	Scanner input = new Scanner(System.in); 
		System.out.println("Please enter the animal name");
		animal_enc.set_Animal_Name(input.nextLine());
		System.out.println("Please enter the animal sex");
		animal_enc.set_Animal_Sex(input.nextLine());
		System.out.println("Please enter the animal family");
		animal_enc.set_Animal_Family(animal_Family_Selector());
		System.out.println("Please enter the species of the animal");
		animal_enc.set_Animal_Species(animal_Species_Selector(animal_enc.get_Animal_Family()));
		animal_enc.set_Animal_Id(object.ID_Gen(animal_enc.get_Animal_Species().substring(0, 2)));
		animal_enc.set_Cage_Assignment("No assignment");
		return animal_enc;
	}
	
	public String animal_Family_Selector() {
		Scanner input = new Scanner(System.in);
		String family = "";
		Integer choice;
		System.out.println("1: Mammal");
		System.out.println("2: Bird");
		System.out.println("3: Reptile");
		choice = input.nextInt();
		
		try {
			if (choice.equals(1)) {
				family = "Mammal";
			
			}
			else if (choice.equals(2)) {
				family = "Bird";
			}
			else if (choice.equals(3)) {
				family = "Reptile";
			} 
			else if (!choice.equals(1) || !choice.equals(2) || choice.equals(3)){
				System.out.println("There has been an unidentified choice");
				animal_Family_Selector();
			}}
			catch (NumberFormatException e) {
				System.out.println("There has been an error in the input");
				e.getCause();
			}
				finally {
						try {
							
						
					System.out.println("1: Mammal");
					System.out.println("2: Bird");
					System.out.println("3: Reptile");
					choice = input.nextInt();
						}
						
						
						/**
						 * Catch any other uncaught exception and close the program if they have not been handled
						 */
					catch (Exception a) { 
						System.out.flush();
						System.out.println("Fatal error occurred");
						a.getStackTrace();
						System.exit(0);
					}
				}
		return family;
	}
	
	public String animal_Species_Selector(String family) {
		Integer choice;
		String type = "";
		Scanner input = new Scanner(System.in);
		if(family.equals("Mammal")) {
			System.out.println("\t1. Ape");
			System.out.println("\t2. Donkey");
			System.out.println("\t3. Guinea-Pig");
			System.out.println("\t4. Horse");
			System.out.println("\t5. Marmoset-Monkey");
			System.out.println("\t6. Rabbit");
			System.out.println("\t7. Tiger");
			System.out.println("\t8. Zebra");
			choice = input.nextInt();
			try {
				switch(choice) {
				case 1:
					type = "Ape";
					break;
				case 2: 
					type = "Donkey";
					break;
				case 3:
					type = "Guinea-Pig";
					break;
				case 4:
					type = "Horse";
					break;
				case 5:
					type = "Marmoset-Monkey";
					break;
				case 6:
					type = "Rabbit";
					break;
				case 7:
					type = "Tiger";
					break;
				case 8:
					type = "Zebra";
					break;
				default:
					System.out.println("Error");
					choice = input.nextInt();
				}
			} catch(NumberFormatException e) {
				System.out.println("There has been an error");
			}
			return type;
			
		} else if (family.equals("Bird")) {
			System.out.println("1. Emu");
			System.out.println("2. Owl");
			System.out.println("3. Penguin");
			System.out.println("4. Vulture");
			choice = input.nextInt();
			try {
				switch(choice) {
				case 1:
					type = "Emu";
					break;
				case 2:
					type = "Owl";
					break;
				case 3:
					type = "Penguin";
					break;
				case 4:
					type = "Vulture";
					break;
				default:
					System.out.println("There has been a choice error");
					choice = input.nextInt();
				}
			} catch(NumberFormatException e) {
				System.out.println("Error");
				e.getStackTrace();
			}
			return type;
			
		} else {
			System.out.println("\t1. Bearded-Dragon");
			System.out.println("\t2. Chameleon");
			System.out.println("\t3. Lizard");
			choice = input.nextInt();
			try {
				switch(choice) {
				case 1:
					type = "Bearded-Dragon";
					break;
				case 2:
					type = "Chameleon";
					break;
				case 3:
					type = "Lizard";
					break;
				default:
					System.out.println("Error with choice selection");
			choice = input.nextInt();
				}
			} catch(NumberFormatException e) {
			System.out.println("Number error exception");
			e.getCause();
			}
			return type;
		}
	}
	
		
	
	public String get_Animal_Id() {
		return animal_ID;
	}

	public void set_Animal_Id(String animal_ID) {
		this.animal_ID = animal_ID;
	}

	public String getanimal_Name() {
		return animal_Name;
	}

	public void set_Animal_Name(String animal_Name) {
		this.animal_Name = animal_Name;
	}

	public String get_Animal_Sex() {
		return animal_Sex;
	}

	public void set_Animal_Sex(String animal_Sex) {
		this.animal_Sex = animal_Sex;
	}

	public String get_Animal_Family() {
		return animal_Family;
	}

	public void set_Animal_Family(String animal_Family) {
		this.animal_Family = animal_Family;
	}

	public String get_Animal_Species() {
		return animal_Species;
	}

	public void set_Animal_Species(String animal_Species) {
		this.animal_Species = animal_Species;
	}

	public String get_Cage_Assignment() {
		return cage_Assignment;
	}

	public void set_Cage_Assignment(String cage_Assignment) {
		this.cage_Assignment = cage_Assignment;
	}
}



	
	
	
	


	

