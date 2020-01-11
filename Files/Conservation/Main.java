import java.util.*; /*Import all to avoid non-defined method implementations for Collections*/
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		String menu = "";
		String option = "";
		String filepath = ""; /*allow the user to identify the filepath*/
	
		external external_object = new external();
		
		external_object.menu_display(); /*output menu*/
		external_object.indent();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input your menu choice");
		do {
			menu = input.nextLine();
			switch (menu) {
			case "1":
				external_object.filereader();
				break;
				
			case "2":
				break;
			case "3":
		break;
		}
	}while (!menu.equals("11"));
		}
		
	
	}