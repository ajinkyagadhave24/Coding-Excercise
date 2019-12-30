package Exception;

public class AgePerson {
	private String ename;
	private int age;
	
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
		AppBank b1= new AppBank("Rohan",22);
		AppBank b2= new AppBank("Ajinkya",12);
		try
		{
			b1.verify();
			b2.verify();
		}
		catch(AgeExceptionBank e)
		{
			System.out.println(e);
		}
	}

}