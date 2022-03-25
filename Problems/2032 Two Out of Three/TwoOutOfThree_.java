//https://leetcode.com/problems/two-out-of-three/submissions/

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] arr = new int[101];
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums1) {
            arr[i] = 1;
        }
        for(int i: nums2) {
            if(arr[i] == 1) {
                set.add(i);
            }
            arr[i] = 2;
        }
        for(int i: nums3) {
            if(arr[i] == 1 || arr[i] == 2) {
                set.add(i);
            }
        }
        for(int i: set) res.add(i);
        return res;
    }
}
