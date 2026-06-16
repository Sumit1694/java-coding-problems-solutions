package CollectionsCodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1
{
	int id;
	String name;

	Employee1(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public String toString()
	{
		return name;
	}
}

class SortByName implements Comparator<Employee1>
{
	@Override
	public int compare(Employee1 e1, Employee1 e2)
	{
		return e1.name.compareTo(e2.name);
	}
}

public class SortEmployeeObjectsByName {

	public static void main(String[] args) {

		List<Employee1> list = Arrays.asList(
				new Employee1(101, "Sumit"),
				new Employee1(102, "Amit"),
				new Employee1(103, "Rohit")
				);

		Collections.sort(list, new SortByName());

		for(Employee1 emp:list)
		{
			System.out.println(emp);
		}
	}
}