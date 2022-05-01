//https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> tt = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(ch=='#') {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else st.push(ch);
        }
        for(char ch: t.toCharArray()) {
            if(ch=='#') {
                if(!tt.isEmpty()) {
                    tt.pop();
                }
            } else tt.push(ch);
        }
        while(!st.isEmpty() && !tt.isEmpty()) {
            if(st.pop()!=tt.pop()) return false;
        }
        if(!st.isEmpty() || !tt.isEmpty()) return false;
        return true;
    }
}
