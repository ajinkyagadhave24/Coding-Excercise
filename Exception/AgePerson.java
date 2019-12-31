package Exception;

import java.util.Scanner;

public class AgePerson {
	private String ename;
	private int age;
	
	public String getEname() {
		return ename;
	}
	public int getAge() {
		return age;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public AgePerson(String ename, int age) {
		this.ename = ename;
		this.age = age;
	}
	public void verify() throws AgeExceptionBank
	{
		if(age<15)
			throw new AgeExceptionBank("Age must be greater than 15....");
		else
			System.out.println("Registration successful...");
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter NAME ,AGE: ");
		String name=sc.next();
		int age=sc.nextInt();
		
		AppBank b1= new AppBank(name,age);
		try
		{
			b1.verify();
		}
		catch(AgeExceptionBank e)
		{
			System.out.println(e);
		}
	}

}
