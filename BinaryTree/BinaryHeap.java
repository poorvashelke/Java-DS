import java.util.Arrays;

/*
 * Binary Max Heap
 */
public class BinaryHeap {
	public static void swap(int[] heap, int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public static int leftChild(int current) {
		return (2 * current) + 1;
	}
	
	public static int rightChild(int current) {
		return (2 * current) + 2;
	}

	public int parent(int current) {
		return (current - 1) / 2;
	}
	
	public static void buildHeap(int[] heap) {
//		 we don't want leaf node to traverse so we start from length / 2, only root nodes will get chosen
//		direction is right to left <---
		for(int i = heap.length/2 + 1; i >= 0; i--) { 
			maxHeapify(heap, i, heap.length);
		}
	}
	
	public static void maxHeapify(int[] heap, int current, int size) {
		int left = leftChild(current);
		int right = rightChild(current);
		int largest = current;
		
		if(left < size && heap[left] > heap[largest]) {
			largest = left;
		}
		if(right < size && heap[right] > heap[largest]) {
			largest = right;
		}
		if(largest != current) {
			swap(heap, current, largest);
			maxHeapify(heap, largest, size);
		}
	}
	
	public static void heapSort(int[] array){
		buildHeap(array);
		for(int i =  array.length - 1; i > -1 ; i--){
			swap(array, 0 , i);
			maxHeapify(array, 0, i);// last element is max so reduce array size by 1
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {20, 30, 100, 18, 15, 40};
		buildHeap(array);
		System.out.print("Max heap: "+Arrays.toString(array));		
		
	}
}

/*
 * public static boolean isMaxHeap(int []heap) {
		if(heap.length == 0)
			return true;
		return isMaxHeap(heap, 0);
	}
	public static boolean isMaxHeap(int []heap, int currentIndex) {
		int parentIndex = parent(currentIndex);
		int leftIndex = left(currentIndex);
		int rightIndex = right(currentIndex);
		if(parentIndex < 0 || currentIndex > heap.length-1)//if root or node not in heap
			return true;
		if(heap[currentIndex] > heap[parentIndex])
			return false;
		return isMaxHeap(heap, leftIndex) && isMaxHeap(heap, rightIndex);
	}	
	*/
