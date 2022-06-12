//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]) {
            return letters[0];
        }
        int low = 0;
        int high = letters.length-1;
        while(low<=high) {
            int mid = low + (high - low)/2;
            if(letters[mid] == target) {
                return letters[mid+1];
            } else if(target < letters[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return letters[low];
    }
}
