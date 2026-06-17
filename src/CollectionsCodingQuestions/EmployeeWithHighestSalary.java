package CollectionsCodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee4
{
	int sal;

	Employee4(int sal)
	{
		this.sal = sal;
	}

	public String toString()
	{
		return String.valueOf(sal);
	}
}

public class EmployeeWithHighestSalary {

	public static void main(String[] args) {

		List<Employee4> list = Arrays.asList(
				new Employee4(50000),
				new Employee4(30000),
				new Employee4(70000),
				new Employee4(40000)
				);

		Employee4 highest = Collections.max(list, Comparator.comparingInt(e -> e.sal));

		System.out.println("Highest salary: " + highest.sal);
	}
}