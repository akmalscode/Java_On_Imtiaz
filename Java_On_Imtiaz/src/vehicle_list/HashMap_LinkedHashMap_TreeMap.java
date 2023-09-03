package vehicle_list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_LinkedHashMap_TreeMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "this is one");
		hm.put(2, "this is two");
		hm.put(3, "This is three");

		// print key
		for (Integer key : hm.keySet()) {
			System.out.println(key);

		}
		// printing value
		for (String value : hm.values()) {
			System.out.println(value);
		}

		// keyvalue pair
		for (Map.Entry<Integer, String> mapEntrySet : hm.entrySet()) {
			System.out.println(mapEntrySet.getKey() + " " + mapEntrySet.getValue());
		}

		System.out.println();

		LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("one", "Oh its 1");
		linkedHashMap.put("two", "Oh its 2");
		linkedHashMap.put("three", "oh its 3");

		for (String key : linkedHashMap.keySet()) {
			System.out.println(key);

		}
		for (String key : linkedHashMap.values()) {
			System.out.println(key);
		}

		for (Map.Entry<String, String> lhm : linkedHashMap.entrySet()) {
			System.out.println(lhm.getKey() + " " + lhm.getValue());
		}

		TreeMap<Integer, Integer> tm = new TreeMap<>();

		tm.put(1, 2);
		tm.put(3, 4);

		for (Integer key : tm.keySet()) {
			System.out.println(key);
		}

		for (Integer value : tm.values()) {
			System.out.println(value);
		}

		for (Map.Entry<Integer, Integer> tree : tm.entrySet()) {
			System.out.println(tree.getKey() + " " + tree.getValue());
		}

	}
}
