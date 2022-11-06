//https://leetcode.com/problems/orderly-queue/

class Solution {
    public String orderlyQueue(String s, int k) {
        char[] arr = s.toCharArray();
        if(k == 1) {
            String min = s;
            for(int i=0; i<arr.length; i++) {
                s = s.substring(1) + s.charAt(0);
                if(min.compareTo(s) >= 0) {
                    min = s;
                }
            }
            return min;
        }
        Arrays.sort(arr);
        return new String(arr);
    }
}
