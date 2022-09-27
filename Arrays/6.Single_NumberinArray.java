class Solution {
    public int singleNumber(int[] nums) {
        //Approach 1: 
        //we can have a freq hashmap which will count frequency of all the elements
        //and at at last we will search the element which has the freq of 1
        // HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int i =0;i<nums.length; i++){
        //     if(!map.containsKey(nums[i]))
        //         map.put(nums[i], 1);
        //     else
        //         map.put(nums[i],map.get(nums[i])+1);
        // }
        // int key=0;
        // for(Map.Entry m: map.entrySet()){
        //     int temp = (int)m.getValue();
        //     if(temp == 1){
        //         key = (int)m.getKey();
        //     }
        // }
        
        //Approach 2:
        //we can have a set storing the array values so that would give us the unique values
        //which when we multiply by 2 that would give us the sum of the array if there were 
        //double values present inside the array
        
        //but in array we have a single value thus to differ it we will take the sum of all the 
        //values that would give us the sum of double values plus single element 
        
        //so by taking difference of these two values we can get the element that was left out
        // Set<Integer> unique = new HashSet<Integer>();
        // int array_sum =0;
        // int set_sum  =0;
        // int single_elem = 0;
        // for(int i =0; i<nums.length; i++){
        //     unique.add(nums[i]);
        //     array_sum+=nums[i];
        // }
        // for(int i:unique){
        //     set_sum+=i;
        // }
        // set_sum*=2;
        // single_elem = set_sum-array_sum;
        // return single_elem;
        
        //approach 3:
        //XOR operation
        //since the characteristic of XOR operation is to give TRUE iff inputs differ
        //in case inputs are same then we have logic 0
        
        //by the same theory we can observe
        //A^B^B = A (since B are double they cancel each other and A is the remainder)
        //
        int xor=0;
        for(int i =0; i<nums.length; i++){
            xor^=nums[i];
        }
        return xor;
      
      //PS: if we are having continuous elements then we can take the difference of the sum of n elements
      //with the sum of array that would give us single element
      //
    }
}
