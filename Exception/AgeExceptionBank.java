package Exception;

public class AgeExceptionBank extends Exception{
	private String msg;
	
	public AgeExceptionBank() {
		
	}
	public AgeExceptionBank(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		if(msg==null)
			return("Age must not be less than 18");
		else
			return msg;
	
	}
	
}