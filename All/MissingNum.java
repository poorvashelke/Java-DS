
public class missingNum {
	private int smallest(int[] arr, int start, int end) {
		if(start > end)
			return -1;
		
		if (start != arr[start])
            return start;
		
		int mid = (start + end) / 2;
		
		if(arr[mid]==mid)
			return smallest(arr, mid+1, end);
		return smallest(arr, start, mid-1);
	}

	public static void main(String[] args) 
    {
        missingNum small = new missingNum();
        int arr[] = {0, 1, 3, 4, 5, 6, 7, 10};
        int n = arr.length;
        System.out.println("First Missing element is : "
                + small.smallest(arr, 0, n - 1));
    }
}
