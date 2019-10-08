import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Person {

	HashMap<String, String> employee1 = new HashMap<String, String>();
	HashMap<String, String> employee2 = new HashMap<String, String>();
	HashMap<String, Integer> employee1_age = new HashMap<String, Integer>();
	HashMap<String, Integer> age2 = new HashMap<String, Integer>();

	public Person() {
	}

	private int m_1 = 0;

	public String manager_entry = "";
	public boolean manager_1 = false;
	String manager_n1 = "";
	String manager_n2 = "";

	public boolean gender_return = false; // used for loop conditions for returning the gender

	public void gender_check() {
		System.out.println("What is the gender of the person?");
		System.out.println("");
		System.out.println("1: Male");
		System.out.println("2: Female");
		System.out.println("");
		Scanner gender = new Scanner(System.in);
		System.out.println("Please type 1 or 2");
		m_1 = gender.nextInt();
		try {
		do {
			if (m_1 == 1) {
				System.out.println("They are male.");
				break;
			}
			if (m_1 == 2) {

				System.out.println("They are female");
				break;
			}
			if (m_1 < 1 || m_1 > 2) {
				System.out.println("This is not a valid input, please try again.");
				m_1 = gender.nextInt();
			}
		} while (m_1 != 1 || m_1 != 2);
		}
		catch (InputMismatchException e) {
			System.out.println("This is not a valid input"); //detect entry on the loop
		}
		if (m_1 == 1)
			gender_return = true;
		else if (m_1 == 2)
			gender_return = false;

	}

	public void gender_output() {
		System.out.println("Gender:");
		if (gender_return = true)
			System.out.print("Male");
		if (gender_return = false)
			System.out.print("Female");
	}

	public void name_check() { // the name can be used in a single method as employee stores the details
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of the employee you would like to add?");
		String employee1_entry = input.next();
		employee1_entry = employee1.put("name", employee1_entry);
	}

	public void name_check2() { // the name can be used in a single method as employee stores the details
		Scanner input = new Scanner(System.in);
		System.out.println("What is the name of the second employee you would like to add?");
		String employee2_entry = input.next();
		employee2_entry = employee2.put("name", employee2_entry);
	}

	public void age_check() { // direct reference from the first class, so a singular method can be used for
								// age
		try {
		Scanner age_check = new Scanner(System.in);
		System.out.println("What is the age of the employee?");
		Integer employee1_a = age_check.nextInt();
		employee1_a = employee1_age.put("age", employee1_a);
		}
		catch (InputMismatchException e) {
			System.out.println("This is not a valid input");
		}
	}

	public void age_check2() { // direct reference from the first class, so a singular method can be used for
								// age - second employee
		try {
		Scanner age_check2 = new Scanner(System.in);
		System.out.println("What is the age of the employee?");
		Integer age2_entry = age_check2.nextInt();
		age2_entry = age2.put("age", age2_entry);
		}
		catch (InputMismatchException e) {
			System.out.println("This is not a valid input");
		}
	}

	public void manager_check() {
		Scanner manager = new Scanner(System.in);
		System.out.println("Is the person a manager?");
		System.out.println("");
		System.out.println("Please type Yes or No");
		manager_entry = manager.next();
		do {
			if (manager_entry.equals("Yes")) {
				System.out.println("They are a manager");
				System.out.println("");
				manager_entry1(); //load 2 menu triggers if they are a manager
				manager_entry2();
				break;
			}
			if (manager_entry.equals("No")) {
				System.out.println("They are not a manager");
				System.out.println("");
			
				break;
			}
		} while (!manager_entry.equals("Yes") || manager_entry.equals("No"));
		
	}
	
	
	
	
	public void manager_entry1() { //use method for asking, and if it is not a manager exit anyways
			
			Scanner manager_name = new Scanner(System.in);
			System.out.println("What is the manager's name?");
			manager_n1 = manager_name.next();
			}
			
	
	public void manager_entry2() { //use method for asking, and if it is not a manager exit anyways
		
		Scanner manager_name2 = new Scanner(System.in);
		System.out.println("What is the second manager's name?");
		manager_n2 = manager_name2.next();
		}
		
	
	public void Sales_Manager() { //sales manager used for child extension
		System.out.println(manager_n2);
	}
	
	public void Marketing_Manager() { //marketing manager used for child extension
		System.out.println(manager_n1);
	}
	
	public void employee1_output() {
		System.out.println("First Employee Details");
		System.out.println("");
		System.out.println("Name: " + employee1.get("name"));
		System.out.println("Age: " + employee1_age.get("age"));
	}

	public void employee2_output() {
		System.out.println("Second Employee Details");
		System.out.println("");
		System.out.println("Name: " + employee2.get("name"));
		System.out.println("Age: " + age2.get("age"));
	}

}
