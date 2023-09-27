package lambdaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CarApps2 {

	public static void main(String[] args) {

		List<Car> cars = Arrays.asList(new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700), new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200), new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300), new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500));

		Function<Car, String> priceAndColor = (c) -> {
			return "Price = " + c.getPrice() + "color= " + c.getColor();
		};

		// more shorter

		Function<Car, String> priceAndColor2 = (c) -> "Price = " + c.getPrice() + "color= " + c.getColor();
		String stringCar = priceAndColor2.apply(cars.get(1));
		System.out.println(stringCar + "@@@@");

		// new approach for lambda expression
		printCars(cars, (car) -> car.getPrice() >= 1800 && car.getPrice() <= 220000);
		printCars(cars, (car) -> car.getColor().equals("Blue"));

	}

	// new approach for lambda expression
	public static void printCars(List<Car> cars, Predicate<Car> condition) { // this predicate is
		for (Car car : cars) {
			if (condition.test(car)) {
				car.printCar();
			}
		}
	}

}
