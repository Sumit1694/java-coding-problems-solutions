package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {

	static List<Integer> commons(List<Integer> list1, List<Integer> list2)
	{
		List<Integer> result = new ArrayList<>();

		Set<Integer> set = new HashSet<>();

		for(int i:list1)
		{
			set.add(i);
		}

		for(int i:list2)
		{
			if(set.contains(i))
			{
				result.add(i);
			}
		}
		return result;
	}

	static List<Integer> commons1(List<Integer> list1, List<Integer> list2)
	{
		list1.retainAll(list2);

		return list1;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5,6));
        System.out.println(commons(list1, list2));
        System.out.println(commons1(list1, list2));

	}

}
