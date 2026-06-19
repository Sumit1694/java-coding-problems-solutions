package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangePositiveAndNegatives {

    static int [] rearrange(int [] arr)
    {
    	List<Integer> pos = new ArrayList<>();
    	List<Integer> neg = new ArrayList<>();

    	for(int n:arr)
    	{
    		if(n>=0)
    		{
    			pos.add(n);
    		}
    		else
    		{
    			neg.add(n);
    		}
    	}

    	int [] result = new int[arr.length];

    	int i=0;
    	int p=0;
    	int n=0;

    	while(p<pos.size() && n<neg.size())
    	{
    		result[i++] = pos.get(p++);
    		result[i++] = neg.get(n++);
    	}

    	while(p<pos.size())
    	{
    		result[i++] = pos.get(p++);
    	}

    	while(n<neg.size())
    	{
    		result[i++] = neg.get(n++);
    	}

    	return result;
    }

	public static void main(String[] args) {

		int [] arr = {1,2,3,-4,-1,4};
		System.out.println(Arrays.toString(rearrange(arr)));
	}
}