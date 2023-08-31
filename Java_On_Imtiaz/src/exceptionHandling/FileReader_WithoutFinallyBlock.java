package exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_WithoutFinallyBlock {

	public static void main(String[] args) {

		File file = new File("myFile.txt"); // if we give wrong file name then exception will occur.

		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found !");

		} catch (IOException e) {
			System.out.println("it is Input output exception !");

		}
	}
}
