//https://leetcode.com/problems/shift-2d-grid/

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        /*
        00 01 02
        10 11 12
        20 21 22
        */
        int m = grid.length;
        int n = grid[0].length;
        int total = m*n;
        k = k%total;
        int start = total - k;
        List<List<Integer>> arr = new ArrayList<>();
        int shift = 0;
        for(int i=start; i<total+start; i++, shift++) {
            int j = i%total;
            int r = j/n;
            int c = j%n;
            if(shift%n==0) {
                arr.add(new ArrayList<Integer>());
            }
            arr.get(arr.size()-1).add(grid[r][c]);
        }
        return arr;
    }
}
