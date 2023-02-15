//https://leetcode.com/problems/add-to-array-form-of-integer/description/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        int n = num.length - 1;
        while(n >= 0 || k != 0){
            if(n >= 0){
                k += num[n--];
            }
            res.addFirst(k%10);
            k /= 10;
        }
        return res;
    }
}
