
public class matrix {
//	Print given matrix in spiral form
	static void spiral(int arr[][], int rsize, int csize)
    {
        int i, row = 0, col = 0;
        while (row < rsize && col < csize)
        {
        	/* first write what to print ex. arr[row][i]
        	 * then increment row
        	 * then think about for loop
        	 */
            // Print the first row
            for (i = col; i < csize; ++i)
            {
                System.out.print(arr[row][i]+" ");
            }
            row++;
  
            // Print the last column
            for (i = row; i < rsize; ++i)
            {
                System.out.print(arr[i][csize-1]+" ");
            }
            csize--;
  
            // Print the last row
            if ( row < rsize)
            {
                for (i = csize-1; i >= col; --i)
                {
                    System.out.print(arr[rsize-1][i]+" ");
                }
                rsize--;
            }
  
            // Print the first column
            if (col < csize)
            {
                for (i = rsize-1; i >= row; --i)
                {
                    System.out.print(arr[i][col]+" ");
                }
                col++;    
            }        
        }
    }
	
	
//    rotate matrix by 90 degrees 
	private static void rotate(int[][] matrix) {
        int n = matrix.length;
//        i= same j=diff
//        same means row or col is same 
        for(int i=0; i<n/2; i++) {
            for(int j=i; j<n-i-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
    }
	
	
//	Search element in a row wise and column wise sorted matrix
	
	public static void searchElement(int matrix[][], int key) {
		int row = 0;
		int col = matrix.length - 1;
		
		while( row < matrix.length && col >= 0) {
			if(matrix[row][col] == key) {
				System.out.println("Key found at :" +row+","+col);
				return;
			}
			if(matrix[row][col] > key)
				col--;
			else
				row++;
		}
		System.out.println("Element not found");
		return;
	}


	static void print(int matrix[][])
    {
		int n = matrix.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(" " + matrix[i][j]);
      
            System.out.print("\n");
        }
        System.out.print("\n");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = 3;
        int C = 3;
        int matrix[][] = { {1,  2,  3},
                      {7,  8,  9},
                      {13, 14, 15}
                    };
        searchElement(matrix, 14);
        
        System.out.println("Spiral Matrix is: ");
        spiral(matrix, R, C);
        System.out.println("90 degree rotated matrix is");
        rotate(matrix);
        print(matrix);
        
	}

}


/* Spiral ------------------------
 * Input:
        1    2   3   4
        5    6   7   8
        9   10  11  12
        13  14  15  16
	Output: 
	1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 

* 90 degree rotate -------------------------------
	* Input:
	* 	1  2  3             
		4  5  6
		7  8  9
	Output:
	7  4  1
	8  5  2
	9  6  3
*/

