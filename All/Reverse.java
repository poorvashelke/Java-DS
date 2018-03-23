
public class reverse {
	public void arrRev(int[] arr, int start, int end) {
		int temp;
		if( start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		arrRev(arr,start + 1, end - 1);
			
	}
	public void print(int[] arr) {
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse r = new reverse();
	    int arr[] = {1, 2, 3, 4, 5, 6};
	    r.print(arr);
	    System.out.println("");
	    System.out.print("Reverse array is:");
	    r.arrRev(arr, 0, arr.length - 1);
	    r.print(arr);
	}

}
