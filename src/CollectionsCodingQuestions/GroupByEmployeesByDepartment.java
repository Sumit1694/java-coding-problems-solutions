package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee6
{
	String name;
	String dept;

	Employee6(String name, String dept)
	{
		this.name = name;
		this.dept = dept;
	}

	public String toString()
	{
		return name;
	}
}

public class GroupByEmployeesByDepartment {

	public static void main(String[] args) {

		List<Employee6> list = Arrays.asList(
				new Employee6("Sumit","QA"),
				new Employee6("Amit","QA"),
				new Employee6("Rohit","IT")
				);

		Map<String,List<Employee6>> map = new HashMap<>();

		for(Employee6 emp : list)
		{
			if(!map.containsKey(emp.dept))
			{
				map.put(emp.dept, new ArrayList<>());
			}
			map.get(emp.dept).add(emp);
		}

		for(Map.Entry<String, List<Employee6>>entry:map.entrySet())
		{
			System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
	}
}