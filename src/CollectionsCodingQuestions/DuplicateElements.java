package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	static void duplicates(List<Integer> list)
	{
        Set<Integer> set = new HashSet<>();

        for(int n:list)
        {
        	if(!set.add(n))
        	{
        		System.out.print(n + " ");
        	}
        }
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,4,1));
		duplicates(list);
	}
}