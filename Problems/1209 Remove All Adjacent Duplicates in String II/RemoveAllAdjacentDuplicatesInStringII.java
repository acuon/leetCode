//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Char> st = new Stack<>();
        for(char ch: s.toCharArray()) {
            if(!st.isEmpty() && st.peek().ch == ch) {
                if(st.peek().count == k-1) {
                    st.pop();
                } else {
                    st.peek().countIncrement();
                }
            } else {
                st.push(new Char(ch));
            }
        }
        StringBuilder str = new StringBuilder();
        for(Char ch: st) {
            str.append(ch.toString());
        }
        return str.toString();
    }
}
class Char {
    char ch;
    int count;
    Char(char ch) {
        this.ch = ch;
        this.count = 1;
    }
    void countIncrement() {
        this.count++;
    }
    @Override
    public String toString() {
        return Character.toString(ch).repeat(count);
    }
}
