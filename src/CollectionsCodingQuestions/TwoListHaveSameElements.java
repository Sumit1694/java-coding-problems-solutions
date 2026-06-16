package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoListHaveSameElements {

	static boolean haveSame(List<Integer>list1, List<Integer> list2)
	{
		list1.removeAll(list2);

		return list1.isEmpty();
	}

	static boolean haveSame1(List<Integer>list1, List<Integer> list2)
	{
		Set<Integer> set1 = new HashSet<>(list1);
		Set<Integer> set2 = new HashSet<>(list2);

		return set1.equals(set2);
 	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3,2,1));
		System.out.println(haveSame(list1, list2));
		System.out.println(haveSame(list1, list2));
	}

}
