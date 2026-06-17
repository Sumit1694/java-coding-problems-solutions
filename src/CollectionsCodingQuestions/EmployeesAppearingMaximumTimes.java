package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesAppearingMaximumTimes {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(101,102,101,101,103));

		Map<Integer,Integer> map = new HashMap<>();

		for(int i:list1)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}

		int freq = 0;
		int num = 0;

		for(Map.Entry<Integer, Integer>entry:map.entrySet())
		{
			if(entry.getValue()>freq)
			{
				freq = entry.getValue();
				num = entry.getKey();
			}
		}

		System.out.println("Employee ID: " + num);
	}
}