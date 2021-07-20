/*
//



*/

//1ms Runtime
class Solution {
    public String truncateSentence(String s, int k) {
        String[] ar = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0; i<k; i++) {
            str.append(ar[i]);
          //if(i==k-1) break;
          //OR
            if(i==k-1) return str.toString();
            str.append(" ");
            
        }
        return str.toString();
    }
}



//0ms Runtime
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                k--;
                if(k <= 0) return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
