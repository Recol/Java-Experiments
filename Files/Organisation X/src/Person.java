import java.util.Scanner;
public class Person {
	private int m_1 = 0;	

	 private String gender_return = ""; //used for loop conditions for returning the gender
	 
	 public Person() {
		}
		
		public String gender_check() {
			System.out.println("What is the gender of the person?");
			System.out.println("");
						System.out.println("1: Male");
			System.out.println("2: Female");
			System.out.println("");
			Scanner gender = new Scanner(System.in);
			System.out.println("Please type 1 or 2");
			m_1 = gender.nextInt();
		
			do {
				if (m_1 == 1) {
					gender_return = "Male";
				System.out.println("They are male.");
					break;
				}
				if (m_1 == 2) {
					gender_return = "Female";
					System.out.println("They are female");
					break;
				}
				if (m_1 <1 || m_1 >2) {
					System.out.println("This is not a valid input, please try again.");
					m_1 = gender.nextInt();
				}
		}while (m_1 != 1 || m_1 != 2);
		return gender_return;
		
		}
		public String name_check() { //the name can be used in a single method as employee stores the details
			String employee1 = "";
			Scanner input = new Scanner(System.in);
			System.out.println("What is the name of the employee you would like to add?");
			employee1 = input.next();
			
			return employee1;
			
		}
		
		
		public int age_check() { //direct reference from the first class, so a singular method can be used for age
			int age = 0;
			Scanner age_check = new Scanner(System.in);
			System.out.println("What is the age of the employee?");
			age = age_check.nextInt();
			
			return age;
		}


}
