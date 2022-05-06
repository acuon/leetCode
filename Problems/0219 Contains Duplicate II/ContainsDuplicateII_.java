//https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> temp;
        for(int i=0; i<nums.length; i++) {
            temp = map.getOrDefault(nums[i], new ArrayList<Integer>());
            temp.add(i);
            if(temp.size()>=2) {
                int idx = temp.size()-1;
                if((temp.get(idx)-temp.get(idx-1))<=k) return true;
            }
            map.put(nums[i], temp);
        }
        return false;
    }
}
