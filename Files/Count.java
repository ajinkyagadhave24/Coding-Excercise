package files;
import java.io.*; 

public class Count
{ 
    public static void main(String[] args) throws IOException 
    { 
		File file = new File("C:\\Users\\ADMIN\\workspace\\Rohan\\src\\Files\\rndfile.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
 
        int wordCount = 0; 
        int charCount = 0; 
        int lineCount=0;
       
        while((line = reader.readLine()) != null) 
        { 
        	lineCount++;
           
            if(!(line.equals(""))) 
            { 
                  
                charCount += line.length();
                String[] wordList = line.split("\\s+"); 
                wordCount+= wordList.length; 
            } 
        } 
        System.out.println("Character Count: " + charCount);
        System.out.println("Word Count : " + wordCount); 
        System.out.println("Lines Count = " + lineCount); 
    } 
} 
