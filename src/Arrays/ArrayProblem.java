package Arrays;

import java.util.ArrayList;
import java.util.List;

//Q-int [] arr = {4, 654, 123, 143, 954}; output [123,143];
public class ArrayProblem {

	static List<Integer> addList(int [] arr)
	{
		List<Integer> list = new ArrayList<>();

		for(int i=0;i<arr.length;i++)
		{
			if(isFirstDigitOne(arr[i]))
			{
				list.add(arr[i]);
			}
		}

		return list;
	}

	static List<Integer> addList1(int [] arr)
	{
		List<Integer> list = new ArrayList<>();

		for(int i=0;i<arr.length;i++)
		{
			String Number = String.valueOf(arr[i]);

			if(Number.charAt(0)=='1')
			{
				list.add(Integer.parseInt(Number));
			}
		}

		return list;
	}

	static boolean isFirstDigitOne(int n)
	{
		while(n>=10)
		{
			n = n/10;
		}
		return n==1;
	}

	public static void main(String[] args) {

		int [] arr = {4, 654, 123, 143, 954};
		//System.out.println(addList(arr));
		System.out.println(addList1(arr));
	}
}