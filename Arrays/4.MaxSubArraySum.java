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
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		ArrayList<Integer> subarray = new ArrayList<>();
		max_subarray(arr, subarray);
		
		for(int i = subarray.get(0) ; i<=subarray.get(1); i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void max_subarray(int[] A, ArrayList<Integer> subarray) {
		//storing the current sum in sum variable
		int sum;
		
		//storing the maximum value in max variable
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<A.length; i++) {
			
			//sum will be initialized with subarray's first element
			sum = 0;
			//System.out.println(max);
			for(int j = i; j<A.length; j++)
			{
				//the oncoming sum will be stored and incremented by sum variable
				sum+=A[j];	
				
				//if the max sum is smaller than sum value 
				//then we store this new max value in max variable
				//also we clear the subarray and add new elements in it
				if(max<sum) {
					subarray.clear(); 
					max = sum; 
					subarray.add(i); 
					subarray.add(j); 
					//System.out.println(max);
				}
			}
		}
	}
}
