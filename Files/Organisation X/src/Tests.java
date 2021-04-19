import static org.mockito.Mockito.*;

import java.util.HashMap;

import org.mockito.Mockito;

public class Tests extends Person {

	private Employee employee;
	private Department department;
	private Person person;

	public void setup() {
		employee = mock(Employee.class);
		department = mock(Department.class);
		person = mock(Person.class);

	}

	public void ValidateVoidMock() {
		doThrow(new Throwable("Exception occurred")).when(employee).name_check2();

	}

	public void ValidateVoidMockDepartment() {
		doThrow(new Throwable("Exception occurred")).when(department).department_data();

	}

	public void ValidateVoidMockPerson() {
		doThrow(new Throwable("Exception occurred")).when(person).gender_output();

	}

	public void run() {
		ValidateVoidMock();
		ValidateVoidMockDepartment();
		ValidateVoidMockPerson();
	}

	@SuppressWarnings("unused")
	private void when(Object name_check2) {
		// TODO Auto-generated method stub

	}

	public HashMap<String, String> StubAge() {
		HashMap<String, String> StubEmployee1 = new HashMap<String, String>();
		StubEmployee1.put("age", "16");
		StubEmployee1.put("age", "17");
		return StubEmployee1;

	}

	public Employee Set_employee_Test() {
		Employee employee = new Employee();
		employee.set_employee2("Susan Smith");
		return employee;
	}

	public Department testDepartment() {
		Department department = new Department();
		department.set_department("department_sales", manager_n1);
		return department;
	}

	public void testStringtoThrowWhenNull() {
		Employee employee = new Employee();
		String name = spy("Susan");
		Mockito.when(employee.set_employee2(name)).thenReturn(name);
		doThrow(new RuntimeException()).when(employee).set_employee2(name = "");
		assert (name != "");
	}

	public void FakeName() {
		Employee fakeEmployee = new Employee();
		String fakeManager = "Matthew";
		String result = fakeEmployee.first_employee(fakeManager);
		assertEquals(fakeManager, result);
	}

}