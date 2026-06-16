package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesPreservingOrder {

	static List<Integer> removeDuplicatesWhilePreservingOrder(List<Integer> list)
	{
		List<Integer> result = new ArrayList<>(new LinkedHashSet<Integer>(list));
		return result;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(5,2,5,1,2,7));
        System.out.println(removeDuplicatesWhilePreservingOrder(list));
	}
}