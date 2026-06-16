package CollectionsCodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedElement {

	static int firstRepeated(int [] arr)
	{
		Set<Integer> set = new HashSet<>();

		for(int n:arr)
		{
		   if(!set.add(n))
		   {
			   return n;
		   }
		}

		return -1;
	}

	public static void main(String[] args) {

		int [] arr = {1,2,3,2,4,5};
		System.out.println(firstRepeated(arr));
	}

}
