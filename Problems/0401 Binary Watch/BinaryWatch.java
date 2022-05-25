//https://leetcode.com/problems/binary-watch/

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> arr = new ArrayList<>();
        for(int i=0; i<12; i++) {
            for(int j=0; j<60; j++) {
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn) {
                    if(j<10) arr.add(i+":0"+j);
                    else arr.add(i+":"+j);
                }
            }
        }
        return arr;
    }
}
