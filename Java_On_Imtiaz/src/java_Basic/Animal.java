package java_Basic;

public class Animal {

	int age;
	String gender;
	int weight;

	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("eating..." + age + gender + weight);
	}

	public void sleep() {
		System.out.println("sleeping...");
	}

}
