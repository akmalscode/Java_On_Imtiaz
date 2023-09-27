package lambdaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractical {

	public static void main(String[] args) {

		IntStream.range(1, 10).forEach((x) -> System.out.print(x + " "));
		System.out.println();
		// Integer Stream with skip
		IntStream.range(1, 10).skip(5).forEach((x) -> System.out.print(x));
		System.out.println();

		// sum
		int val = IntStream.range(1, 10).sum();
		System.out.println(val);

		// find first
		Stream.of("B", "C", "A").sorted().findFirst().ifPresent((x) -> System.out.println(x));

		String[] item = { "car", "computer", "toothpest", "box", "pencil" };
		Stream.of(item).filter((x) -> x.startsWith("c")).sorted().forEach((x) -> System.out.print(x + ", "));

		// avarage
		Arrays.stream(new int[] { 2, 2, 4 }).map((x) -> x * x).average().ifPresent((y) -> System.out.println(y));

		// Stream from the list
		List<String> listOfItem = Arrays.asList("car", "computer", "toothpest", "box", "pencil");
		listOfItem.stream().map((x) -> x.toLowerCase()).filter((x) -> x.startsWith("c")).sorted()
				.forEach((x) -> System.out.print(x + "|"));

	}

}
