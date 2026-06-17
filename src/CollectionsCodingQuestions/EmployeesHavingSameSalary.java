package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee7
{
	String name;
	int sal;

	Employee7(String name,int sal)
	{
		this.name = name;
		this.sal = sal;
	}

	public String toString()
	{
		return name;
	}
}

public class EmployeesHavingSameSalary {

	public static void main(String[] args) {

		List<Employee7> list = Arrays.asList(
				new Employee7("Sumit", 50000),
				new Employee7("Amit", 50000),
				new Employee7("Rohit", 70000)
				);

		Map<Integer,List<Employee7>> map = new HashMap<>();

		for(Employee7 emp:list)
		{
			if(!map.containsKey(emp.sal))
			{
				map.put(emp.sal, new ArrayList<>());
			}
			map.get(emp.sal).add(emp);
		}

		for(Map.Entry<Integer, List<Employee7>>entry:map.entrySet())
		{
			if(entry.getValue().size()>1)
			{
				System.out.println(entry.getKey() + " -> " + entry.getValue());
			}
		}
	}
}