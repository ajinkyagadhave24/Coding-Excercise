import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class flatfile {
	
	public static void main(String args[])
	{
	File file = new File("D:\\test\\test.txt"); 
			 Scanner sc = new Scanner(file); 
			 while (sc.hasNextLine()) 
			 System.out.println(sc.nextLine());
			 FileWriter fw=new FileWriter("D:\\test\\test.txt", true);
			 fw.write("Okay!.");
			 fw.close();    
	}
}
