//https://leetcode.com/problems/combination-sum-iii/

class Solution {
    List<List<Integer>> arr;
    public List<List<Integer>> combinationSum3(int k, int n) {
        arr = new ArrayList<>();
        combinationSum(new ArrayList<Integer>(), k, 1, n);
        return arr;
    }
    public void combinationSum(ArrayList<Integer> temp, int k, int start, int n) {
        if(temp.size()==k && n==0) {
            arr.add(new ArrayList<Integer>(temp));
            return;
        } else {
            for(int i=start; i<=9; i++) {
                temp.add(i);
                combinationSum(temp, k, i+1, n-i);
                temp.remove(temp.size()-1);
            }
        }
    }
}
