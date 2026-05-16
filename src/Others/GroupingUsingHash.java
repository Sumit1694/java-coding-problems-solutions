package Others;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingUsingHash {

	public static void main(String[] args) {

		String [] names = {"amit","babali","tobita","amar","bengan","tumbre"};

		Map<Character,List<String>> map = new HashMap<>();

		for(String name:names)
		{
			char firstChar = name.charAt(0);

			if(!map.containsKey(firstChar))
			{
				map.put(firstChar, new ArrayList<>());
			}
			map.get(firstChar).add(name);
		}

		for(Map.Entry<Character, List<String>> entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}