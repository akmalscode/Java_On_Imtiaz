package lambdaStreams.readingDATA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingCSVandWordFiles {

	public static void main(String[] args) throws IOException {

		Stream<String> lines = Files.lines(Paths.get("src/lambdaStreams/readingDATA/FILE/wordFile.txt"));
		lines.sorted().filter((l) -> l.length() > 11).forEach((x) -> System.out.println(x + " "));
		lines.close();

		System.out.println("^^^^");
		List<String> words = Files.lines(Paths.get("src/lambdaStreams/readingDATA/FILE/wordFile.txt"))
				.filter((x) -> x.contains("th")).collect(Collectors.toList());

		words.forEach((x) -> System.out.println(x + " "));

		System.out.println("^^######^^");

		Stream<String> rows = Files.lines(Paths.get("src/lambdaStreams/readingDATA/FILE/stockDataCsv.txt"));
		rows.map((x) -> x.split(",")).filter(l -> l.length > 3).filter(x -> Integer.parseInt(x[1].trim()) > 15)
				.forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));

	}
}
