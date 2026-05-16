package Others;

import java.util.HashMap;
import java.util.Map;

public class MapSortValues {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("bablu", 2);
		map.put("amit", 1);
		map.put("cindrella", 3);

		/*List<Map.Entry<String,Integer>>list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));

        for(Map.Entry<String, Integer>entry:list)
        {
        	System.out.println(entry.getKey() +" = " + entry.getValue());
        }*/

		map.entrySet().stream().sorted((e1,e2) -> e1.getValue().compareTo(e2.getValue()))
		.forEach(entry -> System.out.println(entry.getKey() +" = " + entry.getValue()));

	}
}