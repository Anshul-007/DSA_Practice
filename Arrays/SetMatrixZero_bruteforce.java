/*
Time complexity: O((MxN)x(M+N))
Space complexity: O(1)

*/




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
		
    
    
		for(int i= 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				
				if(array[i][j] == 0) {
					//mark the row above the zero as -1
					int ind = i-1;
					while(ind>=0) {
						if(array[ind][j] != 0) //important line as we don't want to convert the previous zeroes to -1
							array[ind][j] = -1; 
						ind--;
					}
					//mark the row below the zero as -1
					ind = i+1;
					while(ind<row) {
						if(array[ind][j] != 0)
							array[ind][j] = -1; 
						ind++;
					}
					//mark the column on the left side as -1
					ind = j-1;
					while(ind>=0) {
						if(array[i][ind] != 0)
							array[i][ind] = -1; 
						ind--;
					}
					//mark the column on the right side as -1
					ind = j+1;
					while(ind<col) {
						if(array[i][ind] != 0)
							array[i][ind] = -1; 
						ind++;
				}
				}
			}
		}
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				if(array[i][j]<0)
					array[i][j] = 0;
			}
		}
	}
}


/*
Output is given:
The Final Matrix is 
0 0 0 0 
0 4 5 0 
0 3 1 0 
*/
