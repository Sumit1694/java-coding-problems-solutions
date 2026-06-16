package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesUsingIterator {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,3,4));
		Set<Integer> set = new HashSet<>();

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext())
		{
			Integer val = itr.next();

			if(set.contains(val))
			{
				itr.remove();
			}
			else
			{
				set.add(val);
			}
		}
		System.out.println(set);
	}
}