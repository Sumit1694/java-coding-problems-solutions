package CollectionsCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4));

	    Set<Integer> set = new HashSet<>(list);

	    System.out.println(set);
	}
}