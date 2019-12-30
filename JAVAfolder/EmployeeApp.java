package Employee;

import java.util.Arrays;

public class EmployeeApp {

	public static void main(String[] args) {
		employee []employees=new employee[3];
		
		employees[0]=new employee(10,"ABC","Admin");
		employees[1]=new employee(20,"PQR","Testor");
		employees[2]=new employee(30,"XYZ","Developer");
		
		Arrays.sort(employees);
		for(int i=0;i<employees.length;i++)
			System.out.println(employees[i]);	
		

	}

}
