package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenUsingIterator {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext())
		{
			Integer val = itr.next();

			if(val%2==0)
			{
				itr.remove();
			}
		}

		System.out.println(list);

	}

}
