
public class removeDuplicate {
	private static int removeElement(int[] arr, int size) {
		if(size==0 || size==1)
			return size;
		int index=0;
		
		for(int i=0; i< size-1 ; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[index]=arr[i];
				index++;
			}
		}
		arr[index++]=arr[size-1];	//to print last element in array
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 2, 3, 4, 4, 4, 5, 5};
        int n = arr.length;
         
        int result = removeElement(arr, n);
        System.out.println("After removing duplicate elements:");
        for(int i=0; i< result; i++)
        System.out.print(arr[i]+" ");
	}

}
