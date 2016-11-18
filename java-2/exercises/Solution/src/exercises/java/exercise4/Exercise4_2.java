package exercises.java.exercise4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4_2 {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//Ask the user for the path of the directory.
		String path = "";
		
		System.out.println("Path of the file?");
		try {
			path = input.readLine();
		} catch (IOException e1) {
			System.out.println("IOException");
		}
		
		boolean returnValue = new File(path).mkdirs();
		if(returnValue){
			System.out.println("Success: Directory created");
		}
		else{
			System.out.println("Error: Directory not created");
		}
	}

}
