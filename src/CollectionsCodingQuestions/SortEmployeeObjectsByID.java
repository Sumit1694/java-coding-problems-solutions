package CollectionsCodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
	int id;
	String name;

	Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return id + " " + name;
	}

	@Override
	public int compareTo(Employee e) {

		return this.id - e.id;
	}
}

public class SortEmployeeObjectsByID {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee(103, "Rohit"),
				new Employee(101, "Sumit"),
				new Employee(102, "Amit")
				);

		Collections.sort(list);

		for(Employee emp:list)
		{
			System.out.println(emp);
		}
	}
}