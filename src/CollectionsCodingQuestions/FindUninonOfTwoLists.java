package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindUninonOfTwoLists {

	static Set<Integer> Union(List<Integer> list1, List<Integer> list2)
	{
		Set<Integer> set = new LinkedHashSet<>();

        for(int i:list1)
        {
        	set.add(i);
        }

        for(int i:list2)
        {
        	set.add(i);
        }

        return set;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4,5));
        System.out.println(Union(list1, list2));
	}

}
