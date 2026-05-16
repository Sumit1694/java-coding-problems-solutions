package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StringOperation {

	public static void main(String[] args) {

		String str = "automation";

		Set<Character> set = new LinkedHashSet<>();

		for(char ch:str.toCharArray())
		{
			set.add(ch);
		}

		System.out.println("Unique Characters: " + set);

		Map<Character,Integer> map = new HashMap<>();

		for(char ch:str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

        List<Map.Entry<Character,Integer>>list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (e1,e2) -> e2.getValue().compareTo(e1.getValue()));

        for(Map.Entry<Character, Integer> entry:list)
        {
        	System.out.println(entry.getKey() +" -> " + entry.getValue());
        }
	}
}