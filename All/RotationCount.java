// find min element in the array will have same code, it will return index of the element
public class rotationCount {
// linear search method
	private int lCount(int[] arr, int size) {
		int index = 1;
		
		for(int i=0; i<size-1;i++) {
			if(arr[i] > arr[i+1])
//				index++;
				break;
			index++;
		}
		return index;
	}
	
//	Binary search Method
	static int bCount(int arr[], int low,
            int high)
	{
		//case 1: when array is not rotated 
		if (high < low)
			return 0;
		
		// case 2: If there is only one element left
		if (high == low)
			return low;
		
		int mid = low + high /2; 
		
		// Check if mid itself is minimum element
		if (mid > low && arr[mid] < arr[mid - 1])
			return mid;
		
		// Check if element (mid+1) is minimum
		// element. Consider the cases like
		// {3, 4, 5, 1, 2}
		if (mid < high && arr[mid+1] < arr[mid])
			return (mid + 1);
		
		// Decide whether we need to go to left or right half
		if (arr[high] > arr[mid])
			return bCount(arr, low, mid - 1);
		
		return bCount(arr, mid + 1, high);
	}
	
	public static void main (String[] args) 
    {
		rotationCount r= new rotationCount();
        int arr[] = {15,17,20,21, 2, 3, 6, 12};
        int n = arr.length;
        System.out.print("Linear rotation count:");
        System.out.println(r.lCount(arr, n));
        
        System.out.print("Binary rotation count:");
        System.out.println(bCount(arr, 0, n));
    }
}
