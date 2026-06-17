package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		map.put("A", 300);
		map.put("B", 100);
		map.put("C", 200);

		List<Map.Entry<String,Integer>>list = new ArrayList<>(map.entrySet());

		Collections.sort(list, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));

		for(Map.Entry<String, Integer>entry:list)
		{
			System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
	}
}