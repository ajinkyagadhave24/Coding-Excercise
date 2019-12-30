package Exception;

public class NameEmpException extends Exception{
	private static final long serialVersionUID = 1L;
	private String msg;
	public NameEmpException() {
		
	}
	public NameEmpException(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString()
	{
		if(msg==null)
			return("Name must contain alphabets only...");
		else
			return msg;
	}
}
