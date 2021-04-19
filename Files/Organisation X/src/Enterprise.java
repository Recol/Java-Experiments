import java.util.Scanner;

public class Enterprise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String employee1 = Messages.getString("Enterprise.0"); //$NON-NLS-1$
		String employee2 = Messages.getString("Enterprise.1"); //$NON-NLS-1$
		String option = Messages.getString("Enterprise.2"); //$NON-NLS-1$

		String department_choice = Messages.getString("Enterprise.3"); //$NON-NLS-1$
		String department_choice2 = Messages.getString("Enterprise.4"); //$NON-NLS-1$
		Integer department_verification = 1 - 2;
		boolean dep_choice1 = true; // use boolean for detecting particular departments
		boolean dep_choice2 = true; // use second boolean for second department

		Department Sales = new Department(); // initialise both objects
		Department Marketing = new Department();
		Employee employee = new Employee();
		Person people = new Person();

		System.out.println(Messages.getString("Enterprise.5")); //$NON-NLS-1$
		System.out.println(Messages.getString("Enterprise.6")); //$NON-NLS-1$
		System.out.println(Messages.getString("Enterprise.7")); //$NON-NLS-1$
		System.out.println(Messages.getString("Enterprise.8")); //$NON-NLS-1$

		Scanner input = new Scanner(System.in);
		System.out.println(Messages.getString("Enterprise.9")); //$NON-NLS-1$
		System.out.println(Messages.getString("Enterprise.10")); //$NON-NLS-1$

		do {
			option = input.nextLine(); // utilise string so that an entry will not be accepted until one is chosen
			switch (option) {
			case Messages.getString("Enterprise.11"): //$NON-NLS-1$
				Marketing.department_data(); // return the department data method

				System.out.println(Messages.getString("Enterprise.12")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.13")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.14")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.15")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.16")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.17")); //$NON-NLS-1$

				break;
			case Messages.getString("Enterprise.18"): //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.19")); //$NON-NLS-1$
				employee.employee_info();
				System.out.println(Messages.getString("Enterprise.20")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.21")); //$NON-NLS-1$
				Marketing.department_data();
				System.out.println(Messages.getString("Enterprise.22")); //$NON-NLS-1$

				// use department choices to identify employee outputs
				if (dep_choice1 = true)
					employee.output_1(); // output sales department details

				else if (dep_choice1 = false)
					employee.output_2();

				if (dep_choice2 = true)
					employee.output_3();
				else if (dep_choice2 = false)
					employee.output_4();
				System.out.println(Messages.getString("Enterprise.23")); //$NON-NLS-1$

				System.out.println(Messages.getString("Enterprise.24")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.25")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.26")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.27")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.28")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.29")); //$NON-NLS-1$
				break;
			case Messages.getString("Enterprise.30"): //$NON-NLS-1$
				people.manager_check();
				people.name_check();
				people.age_check();
				people.gender_check(); // load 3 objects referencing name, age and the gender for the first employee
				
				System.out.println(Messages.getString("Enterprise.31")); //$NON-NLS-1$

				// split department choice//
				System.out.println(Messages.getString("Enterprise.32")); //$NON-NLS-1$
				Marketing.department_data();
				System.out.println(Messages.getString("Enterprise.33")); //$NON-NLS-1$
				department_choice = input.next();
				do {

					if (department_choice.equals(Messages.getString("Enterprise.34")) || department_choice.equals(Messages.getString("Enterprise.35"))) { //$NON-NLS-1$ //$NON-NLS-2$

						break;
					}
					System.out.println(Messages.getString("Enterprise.36")); //$NON-NLS-1$
					department_choice = input.next();
				} while (!department_choice.equals(Messages.getString("Enterprise.37")) || !department_choice.equals(Messages.getString("Enterprise.38"))); //$NON-NLS-1$ //$NON-NLS-2$

				System.out.println(Messages.getString("Enterprise.39")); //$NON-NLS-1$
				if (department_choice.equals(Messages.getString("Enterprise.40"))) //$NON-NLS-1$
					dep_choice1 = true;
				else if (department_choice.equals(Messages.getString("Enterprise.41"))) //$NON-NLS-1$
					dep_choice1 = false;
				// first employee//
				Scanner employee2_entry = new Scanner(System.in);
				// use second scanner to prevent passive code execution
				
				people.name_check2();
				people.age_check2();
				people.gender_check();
				// begin second person reference//

				System.out.println(Messages.getString("Enterprise.42")); //$NON-NLS-1$

				System.out.println(Messages.getString("Enterprise.43")); //$NON-NLS-1$
				Marketing.department_data();
				System.out.println(Messages.getString("Enterprise.44")); //$NON-NLS-1$
				department_choice2 = employee2_entry.next();

				do {

					if (department_choice2.equals(Messages.getString("Enterprise.45")) || department_choice2.equals(Messages.getString("Enterprise.46"))) { //$NON-NLS-1$ //$NON-NLS-2$

						break;
					}
					System.out.println(Messages.getString("Enterprise.47")); //$NON-NLS-1$
					department_choice2 = input.next();

				} while (!department_choice2.equals(Messages.getString("Enterprise.48")) || !department_choice2.equals(Messages.getString("Enterprise.49"))); //$NON-NLS-1$ //$NON-NLS-2$
				if (department_choice2.equals(Messages.getString("Enterprise.50"))) //$NON-NLS-1$
					dep_choice2 = true;
				else if (department_choice2 == (Messages.getString("Enterprise.51"))) //$NON-NLS-1$
					dep_choice2 = false;

				// use numerical menu comparisons

				System.out.println(Messages.getString("Enterprise.52")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.53")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.54")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.55")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.56")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.57")); //$NON-NLS-1$
				break;
			case Messages.getString("Enterprise.58"): //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.59")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.60")); //$NON-NLS-1$
				System.out.println(Messages.getString("Enterprise.61")); //$NON-NLS-1$
				System.exit(0);
				input.close();

				break;

			}
		} while (!option.equals(Messages.getString("Enterprise.62"))); // keep menu until the fourth option is shown //$NON-NLS-1$

	}

}
