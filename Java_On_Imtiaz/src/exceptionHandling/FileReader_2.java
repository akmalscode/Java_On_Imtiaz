package exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_2 {
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		File file = new File("myFile.txt"); // if we give wrong file name then exception will occur.
		try {
			fileReader = new FileReader(file);
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
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}

			} catch (IOException e) {
				System.out.println("Unable to close this file" + file.getName() + e);

			}
		}
	}

}
