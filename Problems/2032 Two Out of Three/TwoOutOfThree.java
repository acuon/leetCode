//https://leetcode.com/problems/two-out-of-three/

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> one = new HashSet<>();
        HashSet<Integer> two = new HashSet<>();
        HashSet<Integer> three = new HashSet<>();
        for(int i=0; i<nums1.length; i++) {
            set.add(nums1[i]);
            one.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++) {
            set.add(nums2[i]);
            two.add(nums2[i]);
        }
        for(int i=0; i<nums3.length; i++) {
            set.add(nums3[i]);
            three.add(nums3[i]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i: set) {
            if(one.contains(i) && two.contains(i) || two.contains(i) && three.contains(i) || one.contains(i) && three.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}

