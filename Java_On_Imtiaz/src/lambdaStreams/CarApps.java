package lambdaStreams;

import java.util.Arrays;
import java.util.List;

public class CarApps {

	public static void main(String[] args) {

		List<Car> cars = Arrays.asList(new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700), new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200), new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300), new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500));

		// this is old approach
		PrintCarsPriceRenge(cars, 18000, 22000);
		printCarByColor(cars, "Red");

		// this is anonymous approach
		printCars(cars, new CarCondition() {

			@Override
			public boolean test(Car car) {
				return car.getPrice() >= 1800 && car.getPrice() <= 22000;
			}
		});

		// this is anonymous approach. its called polymorphism
		printCars(cars, new CarCondition() {

			@Override
			public boolean test(Car car) {
				return car.getColor().equals("Blue");
			}
		});

		// new approach for lambda expression
		printCars(cars, (car) -> car.getPrice() >= 1800 && car.getPrice() <= 220000);
		printCars(cars, (car) -> car.getColor().equals("Blue"));

	}

	// new approach for lambda expression
	public static void printCars(List<Car> cars, CarCondition condition) {
		for (Car car : cars) {
			if (condition.test(car)) {
				car.printCar();
			}
		}
	}

	// this is old approach
	public static void PrintCarsPriceRenge(List<Car> cars, int low, int high) {
		for (Car car : cars) {
			if (low <= car.getPrice() && car.getPrice() <= high) {
				car.printCar();
			}
		}
	}

	// this is old approach
	public static void printCarByColor(List<Car> cars, String color) {
		for (Car car : cars) {
			if (car.getColor().equals(color)) {
				car.printCar();
			}
		}
	}

	@FunctionalInterface
	interface CarCondition {
		public boolean test(Car car);
	}

}
