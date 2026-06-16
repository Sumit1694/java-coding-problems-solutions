package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsBylen {

	static void grouping(List<String> list)
	{
		Map<Integer,List<String>>map = new HashMap<>();

		for(String name:list)
		{
			int len = name.length();

			if(!map.containsKey(len))
			{
				map.put(len, new ArrayList<>());
			}

			map.get(len).add(name);
		}

		for(Map.Entry<Integer, List<String>>entry:map.entrySet())
		{
			System.out.println(entry.getKey() +" = " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("java","is","fun","code","hi"));
		grouping(list);
	}

}
