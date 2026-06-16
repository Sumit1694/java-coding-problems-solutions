package CollectionsCodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2
{
	int id;
	String name;
	int sal;

	Employee2(int id, String name, int sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public String toString()
	{
		return name;
	}
}

class SortBySalary implements Comparator<Employee2>
{
	@Override
	public int compare(Employee2 e1, Employee2 e2)
	{
		return Integer.compare(e1.sal, e2.sal);
	}
}

public class SortEmployeeObjectsBySalary {

	public static void main(String[] args) {

		List<Employee2> list = Arrays.asList(
				new Employee2(101, "Sumit", 50000),
				new Employee2(102, "Amit", 30000),
				new Employee2(103, "Rohit", 70000)
				);

        Collections.sort(list, new SortBySalary());

        for(Employee2 emp:list)
        {
        	System.out.println(emp);
        }


	}

}
