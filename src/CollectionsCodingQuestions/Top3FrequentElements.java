package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top3FrequentElements {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,4,4));

		Map<Integer,Integer> map = new HashMap<>();

		for(int n:list)
		{
			map.put(n, map.getOrDefault(n, 0)+1);
		}

		List<Map.Entry<Integer, Integer>>li = new ArrayList<>(map.entrySet());

		Collections.sort(li, (e1,e2) -> Integer.compare(e2.getValue(), e1.getValue()));

        for(int i=0;i<3 && i<li.size();i++)
        {
        	System.out.println(li.get(i).getKey());
        }
	}
}