package Inheritance;

class Employee
{
	int salary;

	public Employee(int salary)
	{
		this.salary = salary;
	}

	void work()
	{
		System.out.println("Working as an employee!");
	}

	public int getSalary()
	{
        return salary;
	}
}

class HRManager extends Employee
{
	public HRManager(int salary)
	{
		super(salary);
	}

	void work()
	{
       System.out.println("\nManaging Employees");
	}

	void AddEmployee()
	{
       System.out.println("\nAdding new Employee");
	}
}

public class InheritanceType4 {

	public static void main(String[] args) {

		Employee e = new Employee(40000);
		HRManager mgr = new HRManager(70000);
		e.work();
		System.out.println("Employee salary: " + e.getSalary());

		mgr.work();
		System.out.println("Manager salary: " + mgr.getSalary());
		mgr.getSalary();
	}
}