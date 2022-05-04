//https://leetcode.com/problems/max-number-of-k-sum-pairs/

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int num: nums) {
            if(map.containsKey(k-num) && map.get(k-num)>0) {
                map.put(k-num, map.get(k-num)-1);
                count++;
            } else {
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        return count;
    }
}
