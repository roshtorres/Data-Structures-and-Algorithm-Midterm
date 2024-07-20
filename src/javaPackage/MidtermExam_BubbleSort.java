package javaPackage;
import java.util.Scanner;

public class MidtermExam_BubbleSort 
{
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Input the number of integers
		System.out.print("Enter number of integers to sort:  ");
		int num = input.nextInt();
		
		int array[] = new int[num];
		
		//Input the integers
		System.out.println("Enter " + num + " integers: ");
		for(int a = 0; a < num; a++)
		{
			array[a] = input.nextInt();
		}
	 
		 //List of Integers
		System.out.print("\nList of Integers: ");
		printArray(array);
		
		//Sorting the integers of an array in ascending/descending order
		sort(array);
		
		//Sorted List of Integers
		System.out.print("\nSorted List of Integers: ");
		printArray(array);
	}
	
	public static void printArray(int array[])
	{
		int num = array.length;
		
		for(int a = 0; a < num; a++)
		{ 
			System.out.print(array[a] + " ");
		}
	}
	
	public static void sort(int array[])
	{ 
		int num = array.length;
		int c;
	
		for (int a = 0; a < num - 1; a++) 
		{ 
			for (int b = 0; b < num - a - 1; b++)
			{ 
				/*For Ascending Order, use ">"
					For Descending Order, use "<"*/
				 if (array[b] > array[b + 1])
				 {
					 //Swap integers
					 c = array[b];
					 array[b] = array[b + 1];
					 array[b + 1] = c;
				}
			} 
		} 
	}
	
}
