package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\ADMIN\\workspace\\Rohan\\src\\files\\rndfile.txt"); 
		  
		BufferedReader br = null;
	    int i=0;
		try {
			br = new BufferedReader(new FileReader(file));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		  
		String str; 
		try {
			while ((str = br.readLine()) != null) 
			    System.out.println(++i+". "+str);
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
