package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KeysHavingSameValues {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 100);
		map.put("D", 300);

		Map<Integer,Set<String>> valueMap = new HashMap<>();

		for(Map.Entry<String, Integer>entry:map.entrySet())
		{
			int value = entry.getValue();
			String key = entry.getKey();

			valueMap.putIfAbsent(value, new HashSet<>());
			valueMap.get(value).add(key);
		}

		for(Set<String> keys:valueMap.values())
		{
			if(keys.size()>1)
			{
				System.out.println(keys);
			}
		}
	}
}