
public class Selregx {
	
	public static void main(String args[]){
		
		String regx= "New World Order 2020 Vinmar";
		if(regx.matches("New [A-Z][a-z].* 202[0-9] V[a-z]...."))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
