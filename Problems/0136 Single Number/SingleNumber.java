//https://leetcode.com/problems/single-number/


//Using Bitwise XOR 
class Solution {
    public int singleNumber(int[] nums) {
        //Bitwise XOR
        //0^2 = 2
        //2^2 = 0
        int num = 0;
        for(int i: nums) {
            num^=i;
        }
        return num;
    }
}

//Using Set
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) {
            if(!set.add(i)) {
                set.remove(i);
            }
        }
        return set.iterator().next();
    }
}
