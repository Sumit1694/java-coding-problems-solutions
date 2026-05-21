package Arrays;

public class TrappingRainWater {

	static int trap(int [] arr)
	{
		int res = 0;
		for(int i=1;i<=arr.length-2;i++)
		{
			int lb = arr[i];

			for(int j=0;j<i;j++)
			{
				if(arr[j]>lb)
				{
					lb = arr[j];
				}
			}

			int rb = arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>rb)
				{
					rb = arr[j];
				}
			}

			int wl;
			if(rb>lb)
			{
				wl = lb;
			}
			else
			{
				wl = rb;
			}

			int tw = wl - arr[i];
			res += tw;
		}
		return res;
	}

	static int trapOptimized(int [] arr)
	{
		int ans = 0;
		int l=0,h=arr.length-1;
		int lmax =0,rmax=0;

		while(l<h)
		{
			lmax = Math.max(lmax, arr[l]);
			rmax = Math.max(rmax, arr[h]);

			if(lmax<rmax)
			{
				ans += lmax - arr[l];
				l++;
			}
			else
			{
				ans += rmax - arr[h];
				h--;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int [] arr = {4,2,0,3,2,5};
		System.out.println(trap(arr));
		System.out.println(trapOptimized(arr));


	}

}
