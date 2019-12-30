import java.util.Scanner;
public class sum {
	int calcusum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		return(sum);
	}
public static void main(String args[])
{
	sum cs=new sum();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num: ");
	int n=sc.nextInt();
	
	
	System.out.println("Sum of natural numbers is:-"+cs.calcusum(n));
	sc.close();
	
}
}
