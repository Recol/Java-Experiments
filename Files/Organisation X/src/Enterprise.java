import java.util.Scanner;
public class Enterprise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
			
		String employee1 = "";
		String employee2 = "";
		String option = "";
		
		Integer department_choice = 0;
		Integer department_choice2 = 0;
		Integer department_verification = 1-2;
		boolean dep_choice1 = true; //use boolean for detecting particular departments
		boolean dep_choice2 = true; //use second boolean for second department
		
		
			Department Sales = new Department(); //initialise both objects
			Department Marketing = new Department(); 
			Employee employee = new Employee();
			
			System.out.println("1: List All Departments (all available departments)");
			System.out.println("2: List All Employees (all employees by name and departments)");
			System.out.println("3: Add Employees (add a new employee by name to a department)");
			System.out.println("4: Exit");
			
			Scanner input = new Scanner(System.in);
			System.out.println("");
			System.out.println("Please input your menu choice");
			
			
			
			do {
				option = input.nextLine(); //utilise string so that an entry will not be accepted until one is chosen
				switch (option) {
				case "1":
					Marketing.department_data(); //return the department data method
					
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
					
					
					//use department choices to identify employee outputs
					if (dep_choice1 = true)
						System.out.println("The first employee "+ employee.employee1 +" belongs to the department "+Sales.department_sales);
					else
						if (dep_choice1 = false)
							System.out.println("The first employee "+ employee.employee1 +" belongs to the department "+Marketing.department_marketing);
					
					if (dep_choice2 = true)
						System.out.println("The second employee "+ employee.employee2 +" belongs to the department "+Sales.department_sales);
					else 
						if (dep_choice2 = false)
							System.out.println("The second employee "+ employee.employee2 +" belongs to the department "+Marketing.department_marketing);
					System.out.println("");
					
					System.out.println("1: List All Departments (all available departments)");
					System.out.println("2: List All Employees (all employees by name and departments)");
					System.out.println("3: Add Employees (add a new employee by name to a department)");
					System.out.println("4: Exit");
					System.out.println("");
					System.out.println("Please input your menu choice");
					break;
				case "3":
					System.out.println("What is the name of the first employee you would like to add?");
					employee1 = input.nextLine();
					employee.set_employee1(employee1); //set object to employee
					System.out.println("");
					
					//split department choice//
					System.out.println("Which department do they belong to?");
					Marketing.department_data();
					System.out.println("Please choose 1 or 2");
					department_choice = input.nextInt();
					if (department_choice == 1)
						dep_choice1 = true;
					else 
						if (department_choice == 2)
							dep_choice1 = false;
						else
					if (department_choice.intValue() != department_verification) //use numerical menu comparisons
					{
						System.out.println("That is not a valid menu input, please try again");
						break;
					}
					System.out.println("");
					
					Scanner employee2_entry = new Scanner(System.in);
					//use second scanner to prevent passive code execution
					System.out.println("What is the name of the second employee you would like to add?");
					employee2 = employee2_entry.nextLine();
					employee.set_employee2(employee2); //set to object
					System.out.println("");
					
					System.out.println("Which department do they belong to?");
					Marketing.department_data();
					System.out.println("Please choose 1 or 2");
					department_choice2 = employee2_entry.nextInt();
					
					if (department_choice2 == 1)
						dep_choice2 = true;
					else 
						if (department_choice2 == 2)
							dep_choice2 = false;
						else
							if (department_choice2.intValue() != department_verification) //use numerical menu comparisons
								 {
									System.out.println("That is not a valid menu input, please try again");
									break;
								}
								
					
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
			}while (!option.equals("4")); //keep menu until the fourth option is shown
			
			
	}

}
