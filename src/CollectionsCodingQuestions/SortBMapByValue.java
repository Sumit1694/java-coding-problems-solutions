package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortBMapByValue {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<>();
		map.put(101, "Sumit");
		map.put(102, "Amit");
		map.put(103, "Rohit");

		List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));

		for(Map.Entry<Integer, String>entry:list)
		{
			System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
	}
}