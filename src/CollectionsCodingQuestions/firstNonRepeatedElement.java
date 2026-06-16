package CollectionsCodingQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatedElement {

	static int firstNonRepeat(int [] arr)
	{
		Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int n:arr)
        {
        	map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
        	if(entry.getValue()==1)
        	{
        		return entry.getKey();
        	}
        }

        return -1;
	}

	public static void main(String[] args) {

		int [] arr = {9,4,9,6,7,4};
        System.out.println(firstNonRepeat(arr));
	}

}
