package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedElement {

	static int mostRepeated(int [] arr)
	{
        Map<Integer,Integer> map = new HashMap<>();

        for(int n:arr)
        {
        	map.put(n, map.getOrDefault(n, 0)+1);
        }

        int mostrep = 0;
        int result = arr[0];

        for(Map.Entry<Integer, Integer>entry:map.entrySet())
        {
        	if(entry.getValue()>mostrep)
        	{
        		mostrep = entry.getValue();
        		result = entry.getKey();
        	}
        }

		return result;
	}

	public static void main(String[] args) {

		int [] arr = {1,3,2,3,4,3,2,2};
		System.out.println(mostRepeated(arr));

	}

}
