package FileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("hellooooooo");

		File file = new File("myFile.txt");
		Scanner input = new Scanner(file);

		while (input.hasNextLine()) {
			String store = input.nextLine();
			System.out.println(store);
		}
		input.close();

	}

}
