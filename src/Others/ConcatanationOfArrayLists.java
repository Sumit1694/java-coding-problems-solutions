package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatanationOfArrayLists {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(5,6,7,8));
		list1.addAll(list2);

		/*for(int i:list2)
		{
			list1.add(i);
		}*/

		System.out.println(list1);



	}

}
