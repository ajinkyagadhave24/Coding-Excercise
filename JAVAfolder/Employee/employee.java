package Employee;

public class employee implements Comparable{
	private int empno;
	private String name;
	private String designation;
	
	public employee(int empno, String name, String designation) {
		this.empno = empno;
		this.name = name;
		this.designation = designation;
	}
	public int getEmpno() {
		return empno;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public int compareTo(Object o) {
		employee e=(employee)o;
		String designation1=e.getDesignation();
		String designation2=this.getDesignation();
		
		return designation2.compareTo(designation1);
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", designation="
				+ designation + "]\n";
	}
	


}
