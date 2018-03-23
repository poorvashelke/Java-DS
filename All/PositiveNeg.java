/*Rearrange positive and negative numbers in O(n) time and O(1) extra space
 * 
 * Original array: 
-1   2   -3   4   5   6   -7   8   9   Array after rearranging: 
4   -3   5   -1   6   -7   2   8   9   
*/
public class positiveNeg {
	private static void rearrange(int[] arr) {
		int size = arr.length;
		int temp;
		int i= 0;//keep count for negative numbers
		for(int j=0; j< size; j++) {
			if(arr[j]<0) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
	
			int pos, neg;
			pos= i;//index of positive element
			neg= 0;//index of neg element
			
			while(arr[neg]<0 && pos < size && pos > neg) {
				temp= arr[neg];
				arr[neg]= arr[pos];
				arr[pos]= temp;
				pos++;
				neg+= 2;
			}
	}
	
/*Segregate 0s and 1s in an array
You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]  */
	private static void segregate(int[] arr) {
		int size= arr.length;
		int count=0;
		
		for (int i = 0; i < size; i++) {
            if (arr[i] == 0)
                arr[count++]= arr[i];
        }
 
//        for (int i = 0; i < count; i++)
//            arr[i] = 0;
 
        for (int i = count; i < size; i++)
            arr[i] = 1;
	}
	
	/* Move all zeros to end of the array
	 * Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
	 * Output : arr[] = {1, 2, 3, 6, 0, 0, 0};	 */
	static void zerosToEnd(int arr[])
    {
		int n = arr.length; 
        int count = 0;  // Count non -zero
 
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; 

        while (count < n)
            arr[count++] = 0;
    }
	
	static void printArray(int arr[])
    {
		int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		System.out.println("Original array: ");
		printArray(arr);
        rearrange(arr);
        System.out.println("Array after rearranging: ");
        printArray(arr);
        
        int arr2[] = {0, 1, 1,0 ,0, 1, 1, 1};
        System.out.println();
        System.out.println("Segreagate zeros and ones: ");
        segregate(arr2);
        printArray(arr2);

        int arr3[] = {0, 2, 1,0 ,0, 15, 4, 0, 11};
        System.out.println();
        System.out.println("Zeros to end of the array:");
        zerosToEnd(arr3);
        printArray(arr3);

	}

}
