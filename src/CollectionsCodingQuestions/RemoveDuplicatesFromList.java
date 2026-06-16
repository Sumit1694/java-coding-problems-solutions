package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {

	static Set<Integer> removeDuplicates(List<Integer> list)
	{
		Set<Integer> set = new HashSet<>(list);

		return set;
	}

	static Set<Integer> removeDuplicates1(List<Integer> list)
	{
		Set<Integer> set = new LinkedHashSet<>(list);

		return set;
	}

	static List<Integer> removeDuplicates2(List<Integer> list)
	{
		List<Integer> result = new ArrayList<>(new LinkedHashSet<>(list));

		return result;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));

        System.out.println(removeDuplicates(list));
        System.out.println(removeDuplicates1(list));
        System.out.println(removeDuplicates2(list));

	}

}
