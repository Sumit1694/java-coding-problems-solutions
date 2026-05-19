package Arrays;

public class MAximumProductSubArray {

	static int maxProduct(int [] arr)
	{
		int maxProduct = arr[0];

		for(int i=0;i<arr.length;i++)
		{
			int product = 1;

			for(int j=i;j<arr.length;j++)
			{
				product *= arr[j];

				maxProduct = Math.max(maxProduct, product);
			}
		}

		return maxProduct;
	}

	public static void main(String[] args) {

		int [] arr = {2,3,-2,4};
		System.out.println(maxProduct(arr));

	}

}
