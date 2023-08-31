package studentInfo;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(101, "Akmal", 12));
		students.add(new Student(102, "Bim", 23));
		students.add(new Student(103, "Camel", 34));

		Collections.sort(students);

		for (Student stu : students) {
			System.out.println(stu.name + " " + stu.rollNo + " " + stu.age);
		}

	}

}
