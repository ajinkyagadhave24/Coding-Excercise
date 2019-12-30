package Exception;

public class ValidEmp {
	private String fname;
	private String lname;
	
	
	public ValidEmp(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public void validate() throws NameEmpException
	{
		if(!lname.matches( "[A-Z][a-z]*" ) || !fname.matches( "[A-Z][a-z]*" ))
			throw new NameEmpException();
		else
			System.out.println("Employee Name is valid");
	}
	public static void main(String[] args) {
		ValidEmp v= new ValidEmp("Rohan","Shelar");
		try
		{
		v.validate();
		}
		catch(NameEmpException e)
		{
			System.out.println(e);
		}
	}
}