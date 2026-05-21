package Arrays;

public class MajorityOFElement {

	static int majorityEle(int [] arr)
	{
        int element = 0;
        int count = 0;

        for(int i=0;i<arr.length;i++)
        {
        	if(count==0)
        	{
        		element = arr[i];
        	}

        	if(arr[i]==element)
        	{
        		count++;
        	}
        	else
        	{
        		count--;
        	}
        }

        count = 0;
        for(int num:arr)
        {
        	if(num==element)
        	{
        		count++;
        	}
        }

        if(count>arr.length/2)
        {
        	return element;
        }

        return -1;

	}

	public static void main(String[] args) {

		int [] arr = {3,3,4,2,3,3,5,3};
		System.out.println("majorityEle: " + majorityEle(arr) );

	}

}
