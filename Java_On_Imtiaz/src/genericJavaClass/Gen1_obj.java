package genericJavaClass;

import java.util.ArrayList;
import java.util.List;

public class Gen1_obj {

	public static void main(String[] args) {
		Object myObject = new Object();
		String myString = new String();
		myObject = myString; // we can assign value

		Employee emp = new Employee();
		Accounts acc = new Accounts();
		emp = acc;// this are the same

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee());
		ArrayList<Accounts> accounts = new ArrayList<>();
		// employees=accounts; //this will now complied

		makeEmpWork(employees);

	}

	public static void makeEmpWork(List<Employee> employees) {
		for (Employee emp : employees) {
			emp.work();
		}
	}

}
