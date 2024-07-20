package javaPackage;

public class _11FibonacciSeries2 
{
	public static void main(String[] args) 
	{
		int number = 20;
		 
		 int[] fibonacciSeries = new int[number];
		 
		 fibonacciSeries[0] = 0;
		 fibonacciSeries[1] = 1;
		 
		 //Storing
		 for(int n = 2; n < number; n++)
		 {
			 fibonacciSeries[n] = fibonacciSeries[n - 1] + fibonacciSeries[n - 2]; //Fibonacci Sequence formula
		 }
		 
		 //Printing
		 for(int n = 0; n < number; n++)
		 {
			 System.out.println(fibonacciSeries[n]);
		 }
	}

}
