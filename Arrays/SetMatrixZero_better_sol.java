//Time complexity: O(MxN)
//Space complecity: O(M)+O(N)



package Practice;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.Collections;

//import java.util.stream.Stream;

public class ProblemA {
    
	public static void main(String[] args) {
		int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(arr);
        
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
	static void setZeroes(int[][]array) {
		//total number of rows and columns
		int row = array.length;
		int col = array[0].length;
		
		//making dummy row and column to store the occurrence of zero
		int dummy_row[] = new int[row];
		int dummy_col[] = new int[col];
		
		//filling the dummy array with 1s or any number except 0
		Arrays.fill(dummy_row, 1);
		Arrays.fill(dummy_col, 1);
		
    //marking the rows and columns as 0 as soon as we hit 0 on array
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				if(array[i][j] == 0) {
					dummy_row[i] = 0;
					dummy_col[j] = 0;
 				}
			}
		}
	
		//when we encounter 0 in dummy row or column convert the value in array to zero
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				if(dummy_row[i] == 0 || dummy_col[j] == 0) {
					array[i][j] = 0;
	 			}
			}	
		}
	}
}
