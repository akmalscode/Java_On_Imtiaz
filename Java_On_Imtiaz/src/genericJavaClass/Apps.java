package genericJavaClass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Apps {

	public static void main(String[] args) {

		Container<Integer, String> container = new Container<>(1, "Akmal");

		container.setItem1(2);
		System.out.println(container.getItem1() + "************");

		container.setItem2("Hossain");
		System.out.println(container.getItem2() + "************");

		int val1 = container.getItem1();
		String val2 = container.getItem2();

		System.out.println(val1);
		System.out.println(val2);

		Set<String> myset1 = new HashSet<String>();
		myset1.add("first");
		myset1.add("Second");
		myset1.add("first");
		myset1.add("Second");

		Set<String> myset2 = new HashSet<String>();
		myset1.add("third");
		myset1.add("forth");
		myset1.add("third");
		myset1.add("forth");

		Set<Integer> myset3 = new LinkedHashSet<>();
		myset3.add(11);
		myset3.add(22);
		myset3.add(11);
		myset3.add(22);

		Set<String> resultSet = union(myset1, myset2);

		Iterator<String> itr = resultSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;

	}

}
