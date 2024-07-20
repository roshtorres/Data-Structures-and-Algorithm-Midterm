package javaPackage;
import java.util.Arrays;

public class _18Program3 
{
	    public static void main(String[] args)
	    {
			int[] num = {10, -1, 8, -3, 6, -5, 4, -7, 2, -9};

	       	int b, c;
	        for (int a = 0; a < num.length; a++)
	        {
	            b = a;   
	           //positive integers appear before all the negative integers
	            while ((b > 0) && (num[b] > 0) && (num[b - 1] < 0))
	            {
	                  c = num[b];
	                  num[b] = num[b - 1];
	                  num[b - 1] = c;
	                  b--;
	            }
	        }
	       System.out.println("The arranged elements of a given array "
	       		+ "of integers in ascending order is: " + Arrays.toString(num)); 
	    }     
	    
 }

