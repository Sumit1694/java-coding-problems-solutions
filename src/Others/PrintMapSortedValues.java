package Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class PrintMapSortedValues {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		map.put("cabli", 103);
		map.put("amit", 101);
		map.put("bablu", 102);

		//List<Integer> list = new ArrayList<>(map.values());

	/*	Collections.sort(list);
		*/

		//list.sort(null);

		//map.values().stream().sorted().forEach(System.out::println);

		TreeSet<Integer> set =
		        new TreeSet<>(map.values());

		for(Integer i:set)
		{
			System.out.println(i);
		}


	}

}
