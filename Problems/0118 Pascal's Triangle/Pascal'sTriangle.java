//https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int row=0; row<numRows; row++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0; i<=row; i++) {
                if(i==0 || i==row) temp.add(1);
                else {
                    int num = arr.get(row-1).get(i-1)+arr.get(row-1).get(i);
                    temp.add(num);
                }
            }
            arr.add(temp);
        }
        return arr;
    }
}
