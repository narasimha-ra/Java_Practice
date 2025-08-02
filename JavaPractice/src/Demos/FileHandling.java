package Demos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {

		// creating file

		File file = new File("Example.txt");

		try {
			if (file.createNewFile()) {
				System.out.println("File Created: " + file.getName());
			} else {
				System.out.println("File already exist!");
			}
		} catch (IOException e) {
			System.out.println("Error Occured:");
			e.printStackTrace();
		}

		// writing to file

		try {
			FileWriter writer = new FileWriter("Example.txt");
			writer.write("This is a sample file.\nFile handling in java is easy");
			writer.close();
			System.out.println("Successfully written to the file.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// reading from file

		try {
			Scanner read = new Scanner(file);

			while (read.hasNextLine()) {
				String line = read.nextLine();
				System.out.println(line);
			}
			read.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
		//deleting file
		
		if(file.delete()) {
			 System.out.println("Deleted the file: " + file.getName());
		}
		else {
			 System.out.println("Failed to delete the file.");
		}

	}

}
