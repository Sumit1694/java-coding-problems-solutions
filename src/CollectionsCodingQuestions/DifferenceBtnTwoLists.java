package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DifferenceBtnTwoLists {

	static List<Integer> btnTwoLists(List<Integer>list1, List<Integer>list2)
	{
         list1.removeAll(list2);

         return list1;
	}

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,4));
		System.out.println(btnTwoLists(list1, list2));
	}
}