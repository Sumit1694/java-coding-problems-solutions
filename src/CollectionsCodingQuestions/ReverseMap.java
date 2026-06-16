package CollectionsCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

	public static void main(String[] args) {

		Map<Character,Integer> map = new HashMap<>();
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);

		Map<Integer,Character> reversedMap = new HashMap<>();

		for(Map.Entry<Character, Integer>entry:map.entrySet())
		{
			reversedMap.put(entry.getValue(), entry.getKey());
		}

		System.out.println(reversedMap);

	}

}
