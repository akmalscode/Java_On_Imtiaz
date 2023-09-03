package vehicle_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddRemove {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(22);
		list1.add(32);
		list1.add(42);
		list1.add(52);
		list1.add(62);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10);

		list1.addAll(list2);
		System.out.println(list2);

		Collections.sort(list1);
		System.out.println(list1);

	}
}
