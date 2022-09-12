//Time complexity: O(MxN + NxM)
//Space complexity: O(M) + O(N)

package Practice;
// import java.io.IOException;
// import java.io.InputStreamReader;
// //import java.math.*;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;
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
		int row = array.length;
		int col = array[0].length;
		int col0 = 0;
		
		//looping entire array skipping 0th column
		//the 0th column will be marked as 1 if 0 is found 
		for(int i = 0; i<row; i++) {
			
			if(array[i][0] == 0) col0 = 1; //code to handle the 0th column
			
			for(int j = 1; j<col; j++) { //notice j is starting from 1 to end
				//if we encounter any 0 then we will mark both dummy row and col as 0
				if(array[i][j] == 0) {
					array[i][0] = array[0][j] = 0;
				}
			}
		}
		
		//now we want to traverse the array from last to first
		//but doing so for each row we want to traverse till 1st index of column**
		for(int i = row-1; i>=0; i--) {
			for(int j = col-1; j>=1; j--) {
				if(array[i][0] == 0 || array[0][j] == 0) {
					array[i][j] =0;
				}
				
			}
			//after execution of all cols till 1st index we need to check
			//if value of col0 is 1 or we are checking if there was any 0 present in
			//0th column thereby completing process of whole array
			
			if(col0 == 1) array[i][0] = 0;
		}
	}
}
