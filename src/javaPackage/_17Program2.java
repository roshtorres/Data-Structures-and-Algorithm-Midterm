package javaPackage;
import java.util.Arrays;

class _17Program2 
{
	
		public static void main(String[] args)
		{
			//Num1
			int[] num1 = {3, 5, 6, 9, 8, 7};
			int[] after1 = sortNewArray(num1);
			System.out.println("After sorting new array becomes: " + Arrays.toString(after1));
	        
			//Num2
			int[] num2 = {5, 0, 1, 2, 3, 4, -2};
			int[] after2 = sortNewArray(num2);
			System.out.println("After sorting new array becomes: " + Arrays.toString(after2));
		}
	    
		private static int[] sortNewArray(int[] num)
		{
			int a = -1, b = -1;
			int before = num[0];

			for (int c = 1; c < num.length; c++)
			{
				if (before > num[c])
				{
					if (a == -1) 
	                {
						a = c - 1;
						b = c;
					}
					else 
	                {
						b = c;
					}
				}
				before = num[c];
			}
			switchNumbers(num, a, b);
	        
			return num;
		}

		private static void switchNumbers(int[] e, int c, int d) 
	    {
			int f = e[c];
	        
			e[c] = e[d];
			e[d] = f;
		}

}
