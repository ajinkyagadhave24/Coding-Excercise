import java.util.Scanner;

public class increasing {
	public static boolean checkNumber(int n)
	{
		String s=Integer.toString(n);
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)<=s.charAt(i+1))
			{
				continue;
			}
			else{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter No:");
		n=scan.nextInt();
		boolean flag=checkNumber(n);
		if(flag)
		{
			System.out.println("The number is an increasing number");
			
		}
		else
			System.out.println("The number is not an increasing number");
	}

}
