package vehicle_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Apps {
	public static void main(String[] args) {

		List<String> animal = new ArrayList<>();
		animal.add("Dog");
		animal.add("Cow");
		animal.add("Cat");

		for (int i = 0; i < animal.size(); i++) {
			System.out.println(animal.get(i));
		}

		for (String value : animal) {
			System.out.println(value);
		}

		// approch 1
		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle v2Vehicle = new Vehicle("Toyota", "Hylander", 54000, true);
		vehicles.add(v2Vehicle);

		for (Vehicle value1 : vehicles) {
			System.out.println(value1);
		}
		System.out.println();

		// approch 2
		LinkedList<Vehicle> myVehicles = new LinkedList<>();
		myVehicles.add(new Vehicle("Nissan", "Maxima", 35000, false));
		myVehicles.add(new Vehicle("Nissan", "Altima", 25000, false));
		myVehicles.add(new Vehicle("Nissan", "Varsa", 15000, false));
		myVehicles.add(new Vehicle("Nissan", "G2", 1135000, false));

		for (Vehicle values2 : myVehicles) {
			System.out.println(values2);

		}
		System.out.println();
		// hashcode
		HashSet<Vehicle> cars = new HashSet<>();

		Vehicle v1 = new Vehicle("Toyota", "Hylander", 540000, true);
		Vehicle v2 = new Vehicle("Toyota", "Hylander", 540000, true);
		Vehicle v3 = new Vehicle("Toyota", "Hylander", 540000, true);

		cars.add(v1);
		cars.add(v2);
		cars.add(v3);

		for (Vehicle vehicle : cars) {
			System.out.println(vehicle);
		}
		System.out.println(v1.equals(v3));

		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v3.hashCode());

		// sorting
		HashSet<Integer> sortingValue = new HashSet<>();
		sortingValue.add(12);
		sortingValue.add(34);
		sortingValue.add(90);
		sortingValue.add(91);
		ArrayList<Integer> mylistArr = new ArrayList<>(sortingValue);

		Collections.sort(mylistArr);
		System.out.println(mylistArr);
	}

}
