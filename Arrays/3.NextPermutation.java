package Practice;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import java.util.Collections;

//import java.util.stream.Stream;

public class ProblemA {
    
	public static void main(String[] args) {
		int[] arr = {5,4,2,3,1};
		nextPermutation(arr);
		int i =0;
		while(i <arr.length) System.out.println(arr[i++]);
	}
	
	public static void nextPermutation(int[] A) {
		//I am taking index starting from second last element
		//however we can also take last element
		int index = A.length-2;
		
		//The second element which will be greater than 'index' element
		//from reverse of array will be stored using 'swap_index'
		int swap_index = A.length -1;
		
		//looping till we get sequenced pair(n,m) where n<m 
		//the index of n will be stored
		//also if we hit -1 index then loop should terminate because no such 
		//pair(n,m) exists 
		while(index>=0&&A[index] > A[index+1]) --index;
			//System.out.println(index);
		
		//now if index is non-negative then...
		if(index>=0) {
			//we will search for element which is greater than 'index' element
			//from end of the array
			while(A[index] >= A[swap_index]) swap_index--;
				//System.out.println(swap_index);
			//swapping the index and swap_index elements
			swap(A, index, swap_index);
			//reversing the array from index+1 till end of array
			reverse(A, index+1, A.length-1);
		}
		
		//if the index is negative then whole array needs to be reversed
		else {
			//reversing
			reverse(A, 0, A.length-1);
		}
		
	}
	public static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	public static void reverse(int[] A, int i, int j) {
		while(i<j) swap(A, i++,j--);
	}
}
