// Array rotation by given number
public class rotateArray {
	private void rotate(int[] arr, int num) {
		int size = arr.length;
		for(int i=0; i<num; i++) {
			rotateByOne(arr,size);
		}
	}

	private void rotateByOne(int[] arr, int size) {
		// TODO Auto-generated method stub
		int i, temp;
		temp = arr[0];
		for(i=0;i<size - 1;i++) {
			arr[i]= arr[i+1];
		}
		arr[i]=temp;
	}
	void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotateArray rotate = new rotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.rotate(arr, 2); //number of elements should be rotated
        rotate.printArray(arr, 7);
	}

}
