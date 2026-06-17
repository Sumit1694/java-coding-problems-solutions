package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountEmployeesDepartmentWise {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("IT");
		list.add("HR");
		list.add("IT");
		list.add("QA");
		list.add("QA");
		list.add("QA");

		Map<String,Integer>map = new HashMap<>();

		for(String dept:list)
		{
			map.put(dept, map.getOrDefault(dept, 0)+1);
		}

		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}