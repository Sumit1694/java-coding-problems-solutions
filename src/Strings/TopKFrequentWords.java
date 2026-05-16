package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentWords {

	public static void main(String[] args) {

		String str = "a b a c b a d c";
		int k = 2;

		String [] words = str.split(" ");

		Map<String,Integer> map= new HashMap<>();

		for(String word:words)
		{
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (e1,e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Top " + k + " frequent words:");

		for(int i=0;i<k && i<list.size();i++)
		{
            Map.Entry<String, Integer> entry = list.get(i);
            System.out.println(entry.getKey() +" -> " + entry.getValue());
		}
	}
}