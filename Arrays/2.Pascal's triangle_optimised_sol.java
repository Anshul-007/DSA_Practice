class Solution {
    public List<List<Integer>> generate(int numRows) {
        //we create row and previous_row
        List<Integer> row, prev =null;
        //we create resultant arraylist
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 0; i<numRows; i++){
            //create a fresh row
            row = new ArrayList<Integer>();
            for(int j = 0; j<=i; j++){
                //edge cases
                if(j == 0 || j == i){
                    row.add(1);
                }
                //in-between
                else{
                    row.add(prev.get(j-1) + prev.get(j));
                }
                
            }
            //storing this row to prev list
            prev = row;
                
            //now store this row to resultant list
            res.add(row);
            
        }
        
        return res;
    }
}
