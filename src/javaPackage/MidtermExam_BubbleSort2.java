package javaPackage;
import java.util.Scanner;

public class MidtermExam_BubbleSort2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		 int a, b, c, swap;
		 
		 //Input the number of integers
		 System.out.print("Enter the number of integers to sort: ");
		 int num = input.nextInt();
		 
		 int array[] = new int[num];
		
		 //Input the integers
		 c = 1;
		 for(a = 0; a < num; a++)
		{
			System.out.print("Enter integer " + c + ": ");
			array[a] = input.nextInt();
			c++;
		}
		 
		 //List of integers
		 System.out.print("\nList of integers: ");  
         for(a = 0; a < num; a++)
         {  
                 System.out.print(array[a] + " ");  
         }  
		   
        //Sorting the integers of an array in ascending/descending order
		 for (a = 0; a < num - 1; a++) 
		 {
			 for (b = 0; b < num - a - 1; b++) 
			 {
				/*For Ascending Order, use ">"
					For Descending Order, use "<"*/
		        if (array[b] > array[b + 1])
		        {
		          //Swap integers
		          swap = array[b];
		          array[b] = array[b + 1];
		          array[b + 1] = swap;
		        }
			 }
		 }
		 
		 //Sorted list of integers
		 System.out.print("\nSorted list of integers: ");
		 for (a = 0; a < num; a++)
		 {
			 System.out.print(array[a] + " ");
		 }
	}

}
