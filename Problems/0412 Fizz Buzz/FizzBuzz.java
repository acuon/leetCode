//https://leetcode.com/problems/fizz-buzz/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            String str = "";
            if(i%3==0) {
                str += "Fizz";
            }
            if(i%5==0) {
                str += "Buzz";
            }
            arr.add(str==""?i+"":str);
        }
        return arr;
    }
}
