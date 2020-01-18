import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Animals {
	
	private String animalId;
	private String animalName;
	private String animalSex;
	private String animalFamily;
	private String animalSpecies;
	private String cageAssignment;
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
		}
	
		public String animal_Species_Selector(String family) {
			Integer choice;
			String type = "";
	
	public String get_Animal_Id() {
		return animalId;
	}

	public void set_Animal)Id(String animalId) {
		this.animalId = animalId;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void set_Animal_Name(String animalName) {
		this.animalName = animalName;
	}

	public String get_Animal_Sex() {
		return animalSex;
	}

	public void set_Animal_Sex(String animalSex) {
		this.animalSex = animalSex;
	}

	public String get_Animal_Family() {
		return animalFamily;
	}

	public void set_Animal_Family(String animalFamily) {
		this.animalFamily = animalFamily;
	}

	public String get_Animal_Species() {
		return animalSpecies;
	}

	public void set_Animal_Species(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}

	public String get_Cage_Assignment() {
		return cageAssignment;
	}

	public void set_Cage_Assignment(String cageAssignment) {
		this.cageAssignment = cageAssignment;
	}
}
}


	
	
	
	


	

