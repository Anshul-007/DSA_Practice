class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //Approach 1: Bruteforce
        //O(N^2)
        //O(1)
        
        //approach 2: Binary Search
        //take two pointers one at the start and another at the end
        //now we take the middle element that would be row/2 and column/2
        //three conditions
        //1. if we are getting the target equal to our matrix[i][j] then we return true;
        //2. if the target is greater than middle element then we need to shift out low value to mid+1
        //3. if the target is lower than middle element then we need to shift our high value to mid-1
     
        //creating two pointers
        int low = 0;
        int high = matrix.length*matrix[0].length -1;
        //row and column
        int row = matrix.length;
        int col = matrix[0].length;
        int middle;
       //middle = (low+high)/2
            
        //intuition: how can we divide middle?? into rows and columns respectively
            //for e.g. we have [1,3,5,7],[10,11,16,20],[23,30,34,60]
            //we can see whenever we complete 4 columns we have 1 row complete
            //so if we have a middle element suppose 6 thus we can say 4+2 is 6
            //that means 1 row complete plus 2 column values
            //thus middle is pointing at '11'
      //O(Logn)
      //O(1)
        while(low<=high){
            middle = (low+high)/2;
            if(matrix[middle/col][middle%col]==target){
                return true;
            }
            else if(matrix[middle/col][middle%col]>target){
                high=middle-1;
                
            }
            else{
                low=middle+1;
                
                
            }
        }
        return false;
      
      //Approach 3:
      //Best Solution
      //Intuition: starting from last index of starting column
      //if we found the target element is greater than given element then we increase the row value
      //else we decrease the column value 
      int row= 0, col = matrix[0].length-1;
      
      while(row<matrix.length && col>=0)
      {
       if(matrix[row][col]>target) col--;
       else if(matrix[row][col]<target) row++;
       else return true;
        
      } 
      return false;
    }
}
