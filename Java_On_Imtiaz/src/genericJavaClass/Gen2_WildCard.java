package genericJavaClass;

import java.util.ArrayList;
import java.util.List;

public class Gen2_WildCard {

	public static void main(String[] args) {

		ArrayList<?> employees2 = new ArrayList<>(); // its called wildcard
		ArrayList<Accounts> accounts2 = new ArrayList<Accounts>();
		accounts2.add(new Accounts());

		employees2 = accounts2;

		// upper bound
		ArrayList<? extends Employee> employees3 = new ArrayList<Employee>();
		ArrayList<Accounts> accounts3 = new ArrayList<Accounts>();
		employees3 = accounts3;

		// lower bound
		ArrayList<? super Employee> employees5 = new ArrayList<Employee>();
		ArrayList<Accounts> accounts5 = new ArrayList<Accounts>();
		// employees5 = accounts5; // we can not assign values

		ArrayList<? super Employee> employees6 = new ArrayList<Employee>();
		ArrayList<Object> accounts6 = new ArrayList<Object>();
		employees6 = accounts6; // we can compile fine because Object is parent and Employee is child

		// interface example
		ArrayList<? extends Employee_Interface> employees4 = new ArrayList<Employee_Interface>();
		ArrayList<Account_interface> accounts4 = new ArrayList<Account_interface>();
		employees4 = accounts4;

		makeEmpWork(accounts2);
		makeEmpWork2(accounts2);
		makeEmpWork3(accounts2);

	}

	public static void makeEmpWork(List<? extends Employee> employees) {
		for (Employee emp : employees) {
			emp.work();
		}
	}

	public static void makeEmpWork2(List<? extends Accounts> employees) {
		for (Accounts emp : employees) {
			emp.work();
		}
	}

	// type cust method
	public static void makeEmpWork3(List<? extends Employee> employees) {
		for (Accounts emp : (ArrayList<Accounts>) employees) {
			emp.work();
		}
	}

}
