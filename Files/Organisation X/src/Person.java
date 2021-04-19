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

	private int Manager_1 = 0;

	public String manager_entry = Messages.getString("Person.0"); //$NON-NLS-1$
	public boolean manager_1 = false;
	String manager_n1 = Messages.getString("Person.1"); //$NON-NLS-1$
	String manager_n2 = Messages.getString("Person.2"); //$NON-NLS-1$

	public boolean gender_return = false; // used for loop conditions for returning the gender

	public void gender_check() {
		System.out.println(Messages.getString("Person.3")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.4")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.5")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.6")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.7")); //$NON-NLS-1$
		Scanner gender = new Scanner(System.in);
		System.out.println(Messages.getString("Person.8")); //$NON-NLS-1$
		Manager_1 = gender.nextInt();
		try {
			do {
				if (Manager_1 == 1) {
					System.out.println(Messages.getString("Person.9")); //$NON-NLS-1$
					break;
				}
				if (Manager_1 == 2) {

					System.out.println(Messages.getString("Person.10")); //$NON-NLS-1$
					break;
				}
				if (Manager_1 < 1 || Manager_1 > 2) {
					System.out.println(Messages.getString("Person.11")); //$NON-NLS-1$
					Manager_1 = gender.nextInt();
				}
			} while (Manager_1 != 1 || Manager_1 != 2);
		} catch (InputMismatchException e) {
			System.out.println(Messages.getString("Person.12")); // detect entry on the loop //$NON-NLS-1$
		}
		if (Manager_1 == 1)
			gender_return = true;
		else if (Manager_1 == 2)
			gender_return = false;

	}

	public void gender_output() {
		System.out.println(Messages.getString("Person.13")); //$NON-NLS-1$
		if (gender_return = true)
			System.out.print(Messages.getString("Person.14")); //$NON-NLS-1$
		if (gender_return = false)
			System.out.print(Messages.getString("Person.15")); //$NON-NLS-1$
	}

	public void name_check() { // the name can be used in a single method as employee stores the details
		Scanner input = new Scanner(System.in);
		System.out.println(Messages.getString("Person.16")); //$NON-NLS-1$
		String employee1_entry = input.next();
		employee1_entry = employee1.put(Messages.getString("Person.17"), employee1_entry); //$NON-NLS-1$
	}

	public void name_check2() { // the name can be used in a single method as employee stores the details
		Scanner input = new Scanner(System.in);
		System.out.println(Messages.getString("Person.18")); //$NON-NLS-1$
		String employee2_entry = input.next();
		employee2_entry = employee2.put(Messages.getString("Person.19"), employee2_entry); //$NON-NLS-1$
	}

	public void age_check() { // direct reference from the first class, so a singular method can be used for
								// age
		try {
			Scanner age_check = new Scanner(System.in);
			System.out.println(Messages.getString("Person.20")); //$NON-NLS-1$
			Integer employee1_a = age_check.nextInt();
			employee1_a = employee1_age.put(Messages.getString("Person.21"), employee1_a); //$NON-NLS-1$
		} catch (InputMismatchException e) {
			System.out.println(Messages.getString("Person.22")); //$NON-NLS-1$
		}
	}

	public void age_check2() { // direct reference from the first class, so a singular method can be used for
								// age - second employee
		try {
			Scanner age_check2 = new Scanner(System.in);
			System.out.println(Messages.getString("Person.23")); //$NON-NLS-1$
			Integer age2_entry = age_check2.nextInt();
			age2_entry = age2.put(Messages.getString("Person.24"), age2_entry); //$NON-NLS-1$
		} catch (InputMismatchException e) {
			System.out.println(Messages.getString("Person.25")); //$NON-NLS-1$
		}
	}

	public void manager_check() {
		Scanner manager = new Scanner(System.in);
		System.out.println(Messages.getString("Person.26")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.27")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.28")); //$NON-NLS-1$
		manager_entry = manager.next();
		do {
			if (manager_entry.equals(Messages.getString("Person.29"))) { //$NON-NLS-1$
				System.out.println(Messages.getString("Person.30")); //$NON-NLS-1$
				System.out.println(Messages.getString("Person.31")); //$NON-NLS-1$
				manager_entry1(); // load 2 menu triggers if they are a manager
				manager_entry2();
				break;
			}
			if (manager_entry.equals(Messages.getString("Person.32"))) { //$NON-NLS-1$
				System.out.println(Messages.getString("Person.33")); //$NON-NLS-1$
				System.out.println(Messages.getString("Person.34")); //$NON-NLS-1$

				break;
			}
		} while (!manager_entry.equals(Messages.getString("Person.35")) || manager_entry.equals(Messages.getString("Person.36"))); //$NON-NLS-1$ //$NON-NLS-2$

	}

	public void manager_entry1() { // use method for asking, and if it is not a manager exit anyways

		Scanner manager_name = new Scanner(System.in);
		System.out.println(Messages.getString("Person.37")); //$NON-NLS-1$
		manager_n1 = manager_name.next();
	}

	public void manager_entry2() { // use method for asking, and if it is not a manager exit anyways

		Scanner manager_name2 = new Scanner(System.in);
		System.out.println(Messages.getString("Person.38")); //$NON-NLS-1$
		manager_n2 = manager_name2.next();
	}

	public void Sales_Manager() { // sales manager used for child extension
		System.out.println(manager_n2);
	}

	public void Marketing_Manager() { // marketing manager used for child extension
		System.out.println(manager_n1);
	}

	public void employee1_output() {
		System.out.println(Messages.getString("Person.39")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.40")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.41") + employee1.get(Messages.getString("Person.42"))); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("Person.43") + employee1_age.get(Messages.getString("Person.44"))); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public void employee2_output() {
		System.out.println(Messages.getString("Person.45")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.46")); //$NON-NLS-1$
		System.out.println(Messages.getString("Person.47") + employee2.get(Messages.getString("Person.48"))); //$NON-NLS-1$ //$NON-NLS-2$
		System.out.println(Messages.getString("Person.49") + age2.get(Messages.getString("Person.50"))); //$NON-NLS-1$ //$NON-NLS-2$
	}

}
