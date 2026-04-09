/*Create a class called Employee that includes three instance variables—a 
first name (type String), a last name (type String) and a monthly salary 
(double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly 
salary is not positive, do not set its value. Write a test application named 
EmployeeTest that demonstrates class Employee’s capabilities. Create two 
Employee objects and display each object’s yearly salary. Then give each 
Employee a 10% raise and display each Employee’s yearly salary again. */


package Assignment02;

class Employee
{
	private String first_name;
	private String last_name;
	private double salary;
	
	public Employee(String first_name, String last_name, double salary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		if(salary>=0) //if salary positive then only sets value
		{
		this.salary = salary;
		}
		else
		{
			this.salary=0.0;
		}
		
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>0)
		{
			this.salary=salary;
		}
		else
		{
			this.salary=0.0;
		}
		
	}
	
	public double  annumSalary()
	{
		return salary*12;
	}
	
	public double raise()
	{
		return salary*12+salary*12*0.10;
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1=new Employee("Sakshi","Kapase",1000);
		double annual_salary1=emp1.annumSalary();
		System.out.println("Annual Salary: "+annual_salary1);
		double raised_salary1=emp1.raise();
		System.out.println("Raised Salary: "+raised_salary1);



		
		System.out.println();

		
		Employee emp2=new Employee("Aarti","Tembare",200);
		double annual_salary2=emp2.annumSalary();
		System.out.println("Annual Salary: "+annual_salary2);
		double raised_salary2=emp2.raise();
		System.out.println("Raised Salary: "+raised_salary2);


		System.out.println();
		Employee emp3=new Employee("Shreya","Nikam",-11);
		double annual_salary3=emp3.annumSalary();
		System.out.println("Annual Salary: "+annual_salary3);
		double raised_salary3=emp3.raise();
		System.out.println("Raised Salary: "+raised_salary3);

}

}
