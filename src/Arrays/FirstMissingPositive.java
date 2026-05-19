package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {

	static int findMissing(int[] arr)
    {
        Map<Integer,Boolean> map = new HashMap<>();

        for(int n:arr)
        {
        	if(n>0)
        	{
        		map.put(n, true);
        	}
        }

        for(int i=1;i<=arr.length;i++)
        {
        	if(!map.containsKey(i))
        	{
        		return i;
        	}
        }

        return arr.length+1;
    }
	public static void main(String[] args) {

		int [] arr = {3,4,-1,1};
		System.out.println(findMissing(arr));
	}

}
