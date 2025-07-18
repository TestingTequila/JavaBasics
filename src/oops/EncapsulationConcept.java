package oops;

public class EncapsulationConcept 
{

	private String empName;
	private int empSalary;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if(!(empName.equals("Ben")))
		{
			this.empName = empName;
		}
		else
		{
			System.out.println(empName + " is not an employee of this Company");
		}
		
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		if(empSalary <1000 || empSalary>10000)
		{
			this.empSalary=0;
		}
		else
		{
		this.empSalary = empSalary;
		}
	}
	
	
	
	
	
	
}
