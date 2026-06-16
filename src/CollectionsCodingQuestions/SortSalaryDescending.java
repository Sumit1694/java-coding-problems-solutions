package CollectionsCodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee3
{
	int sal;

	Employee3(int sal)
	{
		this.sal = sal;
	}

	public String toString()
	{
		return String.valueOf(sal);
	}
}

class sortBySal implements Comparator<Employee3>
{
	public int compare(Employee3 e1, Employee3 e2)
	{
		return Integer.compare(e2.sal, e1.sal);
	}
}

public class SortSalaryDescending {

	public static void main(String[] args) {

		List<Employee3> list = Arrays.asList(
				new Employee3(50000),
				new Employee3(30000),
				new Employee3(70000)
				);

		Collections.sort(list, new sortBySal());

		for(Employee3 emp:list)
		{
			System.out.println(emp);
		}

	}

}
