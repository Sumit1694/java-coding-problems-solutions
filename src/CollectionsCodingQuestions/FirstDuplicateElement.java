package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstDuplicateElement {

	static int firstDuplicate(List<Integer> list)
	{
		Set<Integer> set = new HashSet<>();

        for(int n:list)
        {
        	if(!set.add(n))
        	{
                return n;
        	}
        }

        return -1;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(2,1,3,5,3,2));
        System.out.println(firstDuplicate(list));
	}
}