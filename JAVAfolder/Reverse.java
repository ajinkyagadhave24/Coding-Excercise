import java.util.Scanner;
public class Reverse {
	
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:-");
		str =sc.nextLine();
		
		StringBuffer sb= new StringBuffer();
		
		for(int i=str.length()-1;i>=0;i--)
		{
				sb.append(str.charAt(i));
		}
		System.out.println("Reverse String:-" +sb.toString());
		int vcount=0,wcount=1 ;
		String temp= str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(temp.charAt(i)=='a'  || temp.charAt(i)=='e' || temp.charAt(i)=='i' || temp.charAt(i)=='o' || temp.charAt(i)=='u')
				vcount++;
			if(temp.charAt(i)==' '  || temp.charAt(i)=='\t' || temp.charAt(i)=='\n')
				6wcount++;
		}
		
		System.out.println("Words Count:-"+wcount);
		System.out.println("Vowels Count:-"+vcount);
	}
}
