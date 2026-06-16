package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingElementBetweenTwoLists {

	static int missingElement(List<Integer> list1, List<Integer> list2)
	{
		Set<Integer> set = new HashSet<>(list2);

		for(int i:list1)
		{
			if(!set.contains(i))
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,4,5));
		System.out.println(missingElement(list1, list2));
	}

}
