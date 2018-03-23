
public class rotateFindSum {
	private static boolean findSum(int[] arr, int key) {
		int i= 0;
		int size= arr.length;
		for(i=0; i<size - 1;i++) {
			if(arr[i] > arr[i+1])
				break;
		}
		int low= i+1;
		int high= i;
		
		while(low != high) {
			if(arr[low]+arr[high]== key)
				return true;
			if(arr[low]+arr[high] < key)
				low= low+1 % size;
			if(arr[low]+arr[high] > key)
				high= (size + high-1) % size;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 17;
        System.out.println("Is sum is in the given array:");
        System.out.println(findSum(arr,sum));
	}

}
