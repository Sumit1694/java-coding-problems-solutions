package CollectionsCodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee5
{
	int sal;

	Employee5(int sal)
	{
		this.sal = sal;
	}

	public String toString()
	{
		return String.valueOf(sal);
	}
}

public class EmployeeWithLowestSalary {

	public static void main(String[] args) {

		List<Employee5> list = Arrays.asList(
				new Employee5(50000),
				new Employee5(30000),
				new Employee5(70000)
				);

		Employee5 min = Collections.min(list, Comparator.comparingInt(e -> e.sal));

		System.out.println("Lowest sal: " + min.sal);


	}
}