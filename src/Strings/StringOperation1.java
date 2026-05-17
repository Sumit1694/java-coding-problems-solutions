package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*1. Given a list of strings ("apple", "bat", "car", "apricot", "banana", "cat", write a Java program to:
2. Group the strings by their length.
3. Sort each group of strings alphabetically.
4. Store the result in a Map<Integer, List<String>>, where the key is the length of the strings, and the value is the sorted list of strings of that length.
5. Ensure that the grouping is based on the length of the strings.
 */

public class StringOperation1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "bat", "car", "apricot", "banana", "cat");

		Map<Integer,List<String>> map = new HashMap<>();

		for(String name:list)
		{
            int len = name.length();

            if(!map.containsKey(len))
            {
            	map.put(len, new ArrayList<>());
            }
            map.get(len).add(name);
		}

		List<Map.Entry<Integer, List<String>>> li = new ArrayList<>(map.entrySet());
		for(List<String> n:map.values())
		{
            Collections.sort(n);
		}

		for(Map.Entry<Integer, List<String>> entry:li)
		{
            System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
	}
}