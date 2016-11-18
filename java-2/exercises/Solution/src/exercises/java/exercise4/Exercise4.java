package exercises.java.exercise4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {

	public static void main(String[] args) {
		char toSearch = ' ';
		int timesFound = 0;
		String path = "";
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		//Ask the user for the character to search. Only the first character will be taken into account.
		System.out.println("Char to search?");
		try {
			toSearch = input.readLine().charAt(0);
		} catch (IOException e2) {
			System.out.println("IOException");
		}
		
		//Ask the user for the path of the file.
		System.out.println("Path of the file?");
		try {
			 path = input.readLine();
		} catch (IOException e1) {
			System.out.println("IOException");
		}
		
		//Reads the file
		FileReader fr = null;
		BufferedReader br = null;
		try{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String linea=null;
			while ((linea = br.readLine()) != null){
				char arr[] = linea.toCharArray();
				for(char a : arr){
					if(a == toSearch)
						timesFound++;
				}
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IOException");
		}
		finally{
			//Closing the buffered reader.
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("IOException");
				}
			}
			//Closing the file reader.
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					System.out.println("IOException");
				}
			}
		}
	
		System.out.println(timesFound);
	
	}

}
