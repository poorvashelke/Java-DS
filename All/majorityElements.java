// Program to find majority elements in the array
//A majority element in an array A[] of size n is an element that appears 
//more than n/2 times (and hence there is at most one such element).
import java.util.HashMap;

public class majorityElements {
	private static void find(int[] arr) {
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i=0; i< arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int count = map.get(arr[i]) +1;
				if (count > arr.length /2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);
			}
			else
				map.put(arr[i], 1);
		}
		System.out.println("No majority element is found");
	}
	
//	Find the minimum distance between two numbers
//	Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
//	Output: Minimum distance between 3 and 6 is 4.
	
//	case 1: T(n) = n*n  Bad
	private static int minDis(int[] arr, int first, int second) {
		int minDis = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j=i+1 ;j < arr.length;j++) {
				if((first == arr[i] && second == arr[j] || first == arr[j]&&second==arr[i]) && minDis > Math.abs(i-j))
					minDis=Math.abs(i-j);
			}
		}
		return minDis;
	}
//	case 2: T(n) = n Good
	public static int minDist(int[] arr, int first, int second) {
		int i;
		int prev = 0;
		int minDist = Integer.MAX_VALUE;
		// Find the first occurence of any of the two numbers (x or y)
        // and store the index of this occurence in prev
		for(i = 0; i< arr.length ; i++) {
			if(arr[i] == first || arr[i] == second) {
				prev = i;
				break;
			}
		}
		// Traverse after the first occurence
		for( ; i < arr.length; i++) {
			if(arr[i] == first || arr[i] == second) {
			if(arr[prev] != arr[i] && (prev - i) < minDist) {
				minDist = Math.abs(prev - i);
				prev = i;
			}
			else prev = i;
			}
		}
		return minDist;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{2,1,2,5,5,2,3,3};
        find(arr);
        
        int arr2[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int x = 3;
        int y = 6;
        int x1 = 5 , y1 = 8;
 
        System.out.println("Minimum distance between " + x + " and " + y 
                + " is " + minDis(arr2, x, y));
        System.out.println("Minimum distance between " + x1 + " and " + y1 
                + " is " + minDis(arr2, x1, y1));
	
	}

}
