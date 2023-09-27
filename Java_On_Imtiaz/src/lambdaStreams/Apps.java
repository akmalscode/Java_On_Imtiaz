package lambdaStreams;

import java.util.Scanner;

public class Apps {

	public static void main(String[] args) {
		Human human = new Human();
		human.walk();

		Robot robot = new Robot();
		robot.walk();

		// with instance static variable
		Human human2 = new Human();
		walker(human2);

		Robot wale = new Robot();
		walker(wale);

		// regular implement
		walker(new Walkable() {

			@Override
			public void walk() {
				System.out.println("Custom object walking");

			}
		});

		// lambda single line
		walker(() -> System.out.println("single Lambda object walking"));

		// lambda multiline

		walker(() -> {
			System.out.println("multiline Lambda object walking");
			System.out.println("multiline Lambda object walking");
		});

		// Functional interface; need one abstract method. it means one method but not
		// many.
		ALambdaInterface aBolockofCode = () -> {
			System.out.println("Functional interface Lambda object walking");

		};

		// using regular interface of code
		Walkable aBolockofCod2 = () -> {
			System.out.println("regular interface Lambda object walking");

		};
		walker(aBolockofCod2);

		// two arguments

		Calculate cal = (a, b) -> a + b;
		System.out.println(cal.compute(2, 3));

		// converted regular method to lambda
		Calculate nonZeroDevidee = (a, b) -> {
			if (a == 0) {
				return 0;
			}
			return a / b;
		};

		System.out.println(nonZeroDevidee.compute(10, 2));

		// reverse convert
		StringWorker reverse = (s) -> {
			String result = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				result = result + s.charAt(i);
			}
			return result;
		};
		System.out.println(reverse.work("akmal"));

		// factorial lamda
		factorialNumber fNumber = (a) -> {
			int result = 1;
			for (int i = 1; i <= a; i++) {
				result = i * result;
			}
			return result;
		};

		System.out.println(fNumber.fact(10));

		// generic lambda with keyboard input
		GenericLambdaInfterface<Integer> fenFact = (a) -> {
			int result = 1;
			for (int i = 1; i <= a; i++) {
				result = i * result;
			}
			return result;
		};
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println(fNumber.fact(m));

	}

	////////////

	public String reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = str + str.charAt(i);
		}

		return result;
	}

	public int nonZeroDevide(int arg1, int arg2) {

		if (arg1 == 0) {
			return 0;
		}

		return arg1 / arg2;
	}

	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}

	public static void walker(Walkable walkable) {
		walkable.walk();
	}

	interface StringWorker {
		public String work(String str);
	}

	interface factorialNumber {
		public int fact(int str);
	}
}
