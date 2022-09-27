//This is a classic problem of Dutch national flag algorithm
//O(N)
//O(1)

class Solution {
    public void sortColors(int[] arr) {
        
        //approach 1: sort using Array.sort
        //approach 2: take 3 counters and fill the array using all three pointers in ascending order
        //approach 3: take 3 pointers 2 of which points at the starting index (low and middle) and 
        //              3rd one is high pointer which points at the last index 
        //              intuition: we need to sort 0s and 2s and the 1s are automatically being sorted
                        //how did that work?
                        //basically we are swapping everytime with low index and high index whenever
                        //we hit 0s and 2s respectively and move the pointer low(ahead) and high(behind)
                        //however we don't swap whenever we hit 1s and increase middle pointer
        
        //condition: we need to check every arr[mid] value thus the loop breaks only when mid>high
        int low = 0, mid = 0, high = arr.length-1;
        while(mid<=high){
            int temp;
            switch(arr[mid]){
                case 0: temp = arr[low];
                        arr[low] = arr[mid];
                        arr[mid] = temp;
                        low++;mid++;
                        break;
                case 1: mid++;
                        break;
                case 2: temp = arr[high];
                        arr[high] = arr[mid];
                        arr[mid] = temp;
                        high--;
                        break;
            }
        }
    }
}
