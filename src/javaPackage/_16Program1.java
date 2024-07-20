package javaPackage;

class _16Program1 
{
	public static void main(String[] args)
	{
    	int sizeSubArray = 4;
        
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        
		System.out.println("Sub-array size: " + sizeSubArray);
		int [] sum = findMinimumSubArraySum(num, sizeSubArray);
		System.out.printf("Sub-array from %d  to %d  and sum is: %d", sum[0], sum[1], sum[2]);
	}

	public static int[] findMinimumSubArraySum(int[] num, int sizeSubArray)
	{
		int sumSubArray = 0;
		int minimum = Integer.MAX_VALUE;
		int b = 0;
        
		int[] sum = new int[3];

		for (int a = 0; a < num.length; a++)
		{
			sumSubArray = sumSubArray + num[a];

			if (a + 1 >= sizeSubArray)
			{
				if (minimum > sumSubArray)
				{
					minimum = sumSubArray;
					b = a;
				}

				sumSubArray = sumSubArray - num[(a + 1) - sizeSubArray];
			}
		}
		sum[0] = b - sizeSubArray + 1;
		sum[1] = b;
		sum[2] = minimum;
        
		return sum;		
	}
	
}
