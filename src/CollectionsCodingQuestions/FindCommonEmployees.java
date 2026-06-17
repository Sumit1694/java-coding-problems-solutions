package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonEmployees {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(101,102,103));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(102,103,104));

        list1.retainAll(list2);

        System.out.println(list1);


	}

}
