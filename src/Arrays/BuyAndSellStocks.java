package Arrays;

public class BuyAndSellStocks {

	static int buyAndSell(int [] arr)
	{
		int maxProfit = 0;

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int profit = arr[j] - arr[i];

				if(profit>maxProfit)
				{
					maxProfit = profit;
				}
			}
		}

		return maxProfit;
	}

	static int buyAndSell1(int [] arr)
	{
		int min = arr[0];
		int profit = 0;

		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}

			profit = Math.max(profit, arr[i]-min);
		}
		return profit;
	}

	public static void main(String[] args) {

		int [] arr = {7,1,5,3,6,4};
		System.out.println(buyAndSell1(arr));

	}

}
