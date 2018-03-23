/*Three way partitioning of an array around a given range
1) All elements smaller than lowVal come first.
2) All elements in range lowVal to highVVal come next.
3) All elements greater than highVVal appear in the end.

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
        lowVal = 14, highVal = 20
Output: arr[] = {1, 5, 4, 2, 1, 3, 14, 20, 20, 98, 87, 32, 54}

Input: arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
       lowVal = 20, highVal = 20       
Output: arr[] = {1, 14, 5, 4, 2, 1, 3, 20, 20, 98, 87, 32, 54} 
 */
public class threeWayPartition {

	private static void partition(int[] arr, int lowval, int highval) {
		int size = arr.length;
		int start = 0;
		int end = size - 1;
		
		for(int i = 0; i < end;) {
			if(arr[i] < lowval) {
				swap(arr, i, start);
				start++;
				i++;
			}
			else if(arr[i] > highval) {
				swap(arr, i, end);
				end--;
			}
			else i++;
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private static void print(int[] arr) {
		System.out.println("Modified array ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
     
        }    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        partition(arr, 10, 20);
        print(arr);
  
        
	}

}
