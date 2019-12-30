package Exception;

public class PersonAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  msg;

	public PersonAgeException() {
		
	}
	public PersonAgeException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		if(msg==null)
			return("Age must not be less than 15");
		else
			return msg;
	}
}
