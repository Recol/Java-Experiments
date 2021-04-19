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
		doThrow(new Throwable(Messages.getString("Tests.0"))).when(employee).name_check2(); //$NON-NLS-1$

	}

	public void ValidateVoidMockDepartment() {
		doThrow(new Throwable(Messages.getString("Tests.1"))).when(department).department_data(); //$NON-NLS-1$

	}

	public void ValidateVoidMockPerson() {
		doThrow(new Throwable(Messages.getString("Tests.2"))).when(person).gender_output(); //$NON-NLS-1$

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
		StubEmployee1.put(Messages.getString("Tests.3"), Messages.getString("Tests.4")); //$NON-NLS-1$ //$NON-NLS-2$
		StubEmployee1.put(Messages.getString("Tests.5"), Messages.getString("Tests.6")); //$NON-NLS-1$ //$NON-NLS-2$
		return StubEmployee1;

	}

	public Employee Set_employee_Test() {
		Employee employee = new Employee();
		employee.set_employee2(Messages.getString("Tests.7")); //$NON-NLS-1$
		return employee;
	}

	public Department testDepartment() {
		Department department = new Department();
		department.set_department(Messages.getString("Tests.8"), manager_n1); //$NON-NLS-1$
		return department;
	}

	public void testStringtoThrowWhenNull() {
		Employee employee = new Employee();
		String name = spy(Messages.getString("Tests.9")); //$NON-NLS-1$
		Mockito.when(employee.set_employee2(name)).thenReturn(name);
		doThrow(new RuntimeException()).when(employee).set_employee2(name = Messages.getString("Tests.10")); //$NON-NLS-1$
		assert (name != Messages.getString("Tests.11")); //$NON-NLS-1$
	}

	public void FakeName() {
		Employee fakeEmployee = new Employee();
		String fakeManager = Messages.getString("Tests.12"); //$NON-NLS-1$
		String result = fakeEmployee.first_employee(fakeManager);
		assertEquals(fakeManager, result);
	}

}