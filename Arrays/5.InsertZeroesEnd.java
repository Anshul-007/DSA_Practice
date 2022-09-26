//package Practice;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
//import java.util.Collections;

//import java.util.stream.Stream;

public class ProblemA {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {0,1,0,2,0,0,0,2,1};
		
		//calling
		moveZeroes(arr, arr.length);
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	
	}
	
	public static void moveZeroes(int[] arr, int arrsize) {
		
		//BruteForce
		//take an array of same size only initialize when the digits or non-zero
		//take the last index of the initialized array then start inserting 0 till N
//		int j =0;
//		int temp[] = new int[arrsize];
//		for(int i = 0; i<arrsize;i++) {
//			if(arr[i] !=0) {
//				temp[j++] = arr[i];
//			}
//		}
//		while(j<arrsize) {
//			temp[j++] = 0;
//		}
//		
//		for(int i =0; i<arrsize; i++) {
//			arr[i] = temp[i];
//		}
		//O(N)
		//O(N)
		
		
		
		//Better:
		//whenever we encounter a zero then 
		//we execute a loop in which we start shifting the the elments behind
		//to one place ahead
		
//		for(int i =0;i<arrsize;i++) {
//			if(arr[i]==0) {
//				for(int k =i+1; k<arrsize; k++) {
//					arr[k-1] = arr[k];
//				}
//				arr[arrsize-1] = 0;
//			}
//		}
		//O(N^2)
		//O(1)
		
		
		
		
		
		
		//Best:
		//1 2 0 1 0 4 0
		//take two pointers one pointing to the index where last 
		//zero was encountered (i)
		//now whenever we hit a non-zero again we shuffle the digits(j)
		//i.e. i with j
		//don't forget to increase the value of i if we encounter a non-zero
		int j =0, i =0;
		while(j<arrsize) {
			//in case we find a zero then we increase j ptr and continue
			if(arr[j] == 0) {
				j++;
				continue;
			}
			else {
				//if we found that the element is a non zero(1,2,3,4,...)
				//then we check whether i and j were seperated if yes then we 
				//swap them and increase the i to next index
				if(i!=j) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				i++;
			}
			j++;
		}
		
		//O(N)
		//O(1)
	}
}
