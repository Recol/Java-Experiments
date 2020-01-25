
import java.util.*; /*Import all to avoid non-defined method implementations for Collections*/
public class Main {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
	
		String menu = "";
		String option = "";
	
	
		external external_object = new external();
		
		external_object.menu_display(); /*output menu*/
		external_object.indent();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input your menu choice");
		do {
			System.out.println("Menu");
			
			external_object.indent();
			external_object.menu_display(); /*output menu*/
			menu = input.nextLine();
			switch (menu) {
			case "1":
				
				File_IO.readEnclosureData();
				break;
				
			case "2":
				File_IO.readCageData();
				System.out.println("Cage data loaded");
				break;
			case "3":
				File_IO.readKeeperData();
				System.out.println("");
				System.out.println("Keeper data loaded");
				break;
			case "4":
				File_IO.readAnimalData();
				System.out.println("");
				System.out.println("Animal data read");
			}
	}while (!menu.equals("10"));
		}
		
	
	}