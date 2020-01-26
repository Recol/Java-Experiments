
import java.util.*; /*Import all to avoid non-defined method implementations for Collections*/
class Main {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
	
		String menu = "";
		String option = "";
	
	
		external external_object = new external();
		Animals animal = new Animals();
		Keepers keeper = new Keepers();
		File_IO file = new File_IO();
		
		external_object.indent();
		
		Scanner input = new Scanner(System.in);
		
		
		/*
		 * This menu will be responsible for loading in the required menu, and allowing the user to select an option.
		 * Each method will be loaded accordingly.
		 */

		do {
			System.out.println("Menu");
			
			external_object.indent();
			external_object.menu_display(); /*output menu*/
			menu = input.nextLine();
			switch (menu) {
			case "1":
				
				file.readEnclosureData();
				break;
				
			case "2":
				file.readCageData();
				System.out.println("Cage data loaded");
				break;
			case "3":
				file.readKeeperData();
				System.out.println("");
				System.out.println("Keeper data loaded");
				break;
			case "4":
				file.readAnimalData();
				System.out.println("");
				System.out.println("Animal data read");
				break;
			case "5":
				file.readAnimalData();
				file.readCageData();
				file.readEnclosureData();
				file.readKeeperData();
				System.out.println("");
				System.out.println("All the details have been loaded.");
				break;
			case "6":
				animal.new_Animal();
				break;
			case "8":
				keeper.keeper_details();
				System.out.println("The keeper has been assigned to the cage.");
				break;
			case "9":
				keeper.remove_keeper();
				break;
			case "10":
				Derived d = new Derived();
				d.exit();
			}
	}while (!menu.equals("10"));
		}
		
	
	}