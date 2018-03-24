//import java.util.Collections;
import java.util.Arrays;

//find three largest elements of given array

public class findMaxElements {
	
//	T(n) = O (n log n)
	 private static void largest(int[] arr, int k) 
	    {	// k is  no of max ele you want
	        // Sort the given array in reverse order
	        //Arrays.sort(arr, Collections.reverseOrder()); 
	        Arrays.sort(arr);
		    for (int i = arr.length - 1; i >= arr.length - k; i--) 
		    System.out.print(arr[i] + " ");
	    }

	
//	 Different approach
	 private static void printlargest(int arr[])
	    {
	        int i, first, second, third;
	   
	        /* There should be atleast two elements */
	        if (arr.length < 3)
	        {
	            System.out.print(" Invalid Input ");
	            return;
	        }
	       
	        third = first = second = Integer.MIN_VALUE;
	        for (i = 0; i < arr.length ; i ++)
	        {
	            /* If current element is smaller than
	            first*/
	            if (arr[i] > first)
	            {
	                third = second;
	                second = first;
	                first = arr[i];
	            }
	       
	            /* If arr[i] is in between first and
	            second then update second  */
	            else if (arr[i] > second)
	            {
	                third = second;
	                second = arr[i];
	            }
	       
	            else if (arr[i] > third)
	                third = arr[i];
	        }
	       
	        System.out.println("Three largest elements are " +
	                       first + " " + second + " " + third);
	    }
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 23, 12, 9, 30, 2, 50};
		int k = 3;
		largest(arr,k);
		//int n = sizeof(arr)/sizeof(arr[0]);
		printlargest(arr);
	}

}
