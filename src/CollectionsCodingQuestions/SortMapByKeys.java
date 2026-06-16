package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeys {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(3, "Java");
		map.put(1, "API");
		map.put(2, "Selenium");

		TreeMap<Integer,String> sortedMap = new TreeMap<>(map);

		for(Map.Entry<Integer, String>entry:sortedMap.entrySet())
		{
			System.out.println(entry.getKey() +" -> " + entry.getValue());
		}


	}

}
