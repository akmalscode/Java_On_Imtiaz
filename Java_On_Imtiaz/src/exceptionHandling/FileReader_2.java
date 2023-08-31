package exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_2 {
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		File file = new File("myFilee.txt");
		try {
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = bufferedReader.readLine();
			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found !");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("it is Input output exception !");
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("its close");
				e.printStackTrace();
			}
		}
	}

}
