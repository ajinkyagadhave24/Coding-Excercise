package Exception;

public class ValidEmp {
	private String fname;
	private String lname;
	
	
	public ValidEmp(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	public void validate() throws NameEmpException
	{
		if(!lname.matches( "[A-Z][a-z]*" ) || !fname.matches( "[A-Z][a-z]*" ))
			throw new NameEmpException();
		else
			System.out.println("Employee Name is valid");
	}
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + "]";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter FULL NAME: ");
		String fname=sc.next();
		String lname=sc.next();
		
		ValidEmp v= new ValidEmp(fname,lname);
		System.out.println("Entered name is:-");
		System.out.println(v);
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
