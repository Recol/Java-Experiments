import java.util.Scanner;

public class Enterprise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String employee1 = "";
		String employee2 = "";
		String option = "";

		String department_choice = "";
		String department_choice2 = "";
		Integer department_verification = 1 - 2;
		boolean dep_choice1 = true; // use boolean for detecting particular departments
		boolean dep_choice2 = true; // use second boolean for second department

		Department Sales = new Department(); // initialise both objects
		Department Marketing = new Department();
		Employee employee = new Employee();
		Person people = new Person();

		System.out.println("1: List All Departments (all available departments)");
		System.out.println("2: List All Employees (all employees by name and departments)");
		System.out.println("3: Add Employees (add a new employee by name to a department)");
		System.out.println("4: Exit");

		Scanner input = new Scanner(System.in);
		System.out.println("");
		System.out.println("Please input your menu choice");

		do {
			option = input.nextLine(); // utilise string so that an entry will not be accepted until one is chosen
			switch (option) {
			case "1":
				Marketing.department_data(); // return the department data method

				System.out.println("1: List All Departments (all available departments)");
				System.out.println("2: List All Employees (all employees by name and departments)");
				System.out.println("3: Add Employees (add a new employee by name to a department)");
				System.out.println("4: Exit");
				System.out.println("");
				System.out.println("Please input your menu choice");

				break;
			case "2":
				System.out.println("All of the available employees are:");
				employee.employee_info();
				System.out.println("");
				System.out.println("All of the available departments are");
				Marketing.department_data();
				System.out.println("");

				// use department choices to identify employee outputs
				if (dep_choice1 = true)
					employee.output_1(); // output sales department details

				else if (dep_choice1 = false)
					employee.output_2();

				if (dep_choice2 = true)
					employee.output_3();
				else if (dep_choice2 = false)
					employee.output_4();
				System.out.println("");

				System.out.println("1: List All Departments (all available departments)");
				System.out.println("2: List All Employees (all employees by name and departments)");
				System.out.println("3: Add Employees (add a new employee by name to a department)");
				System.out.println("4: Exit");
				System.out.println("");
				System.out.println("Please input your menu choice");
				break;
			case "3":
				people.manager_check();
				people.name_check();
				people.age_check();
				people.gender_check(); // load 3 objects referencing name, age and the gender for the first employee
				
				System.out.println("");

				// split department choice//
				System.out.println("Which department do they belong to?");
				Marketing.department_data();
				System.out.println("Please choose 1 or 2");
				department_choice = input.next();
				do {

					if (department_choice.equals("1") || department_choice.equals("2")) {

						break;
					}
					System.out.println("That is not a valid menu input, please try again");
					department_choice = input.next();
				} while (!department_choice.equals("1") || !department_choice.equals("2"));

				System.out.println("");
				if (department_choice.equals("1"))
					dep_choice1 = true;
				else if (department_choice.equals("2"))
					dep_choice1 = false;
				// first employee//
				Scanner employee2_entry = new Scanner(System.in);
				// use second scanner to prevent passive code execution
				
				people.name_check2();
				people.age_check2();
				people.gender_check();
				// begin second person reference//

				System.out.println("");

				System.out.println("Which department do they belong to?");
				Marketing.department_data();
				System.out.println("Please choose 1 or 2");
				department_choice2 = employee2_entry.next();

				do {

					if (department_choice2.equals("1") || department_choice2.equals("2")) {

						break;
					}
					System.out.println("That is not a valid menu input, please try again");
					department_choice2 = input.next();

				} while (!department_choice2.equals("1") || !department_choice2.equals("2"));
				if (department_choice2.equals("1"))
					dep_choice2 = true;
				else if (department_choice2 == ("2"))
					dep_choice2 = false;

				// use numerical menu comparisons

				System.out.println("1: List All Departments (all available departments)");
				System.out.println("2: List All Employees (all employees by name and departments)");
				System.out.println("3: Add Employees (add a new employee by name to a department)");
				System.out.println("4: Exit");
				System.out.println("");
				System.out.println("Please input your menu choice");
				break;
			case "4":
				System.out.println("The application will now exit");
				System.out.println("");
				System.out.println("Goodbye");
				System.exit(0);
				input.close();

				break;

			}
		} while (!option.equals("4")); // keep menu until the fourth option is shown

	}

}
