package Exception;

public class AppBank {
	private String name;
	private int age;
	
	public AppBank(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void verify() throws AgeExceptionBank
	{
		if(age<18)
			throw new AgeExceptionBank("Age has to be 18...");
		else
			System.out.println("Registration successfull...");
	}
	public static void main(String[] args){
		AppBank b1=new AppBank("Ajinkya",21);
		AppBank b2=new AppBank("Rohan",22);
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
