//https://leetcode.com/problems/validate-stack-sequences/description/

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack();
        int n = pushed.length;
        int j = 0;
        for(int i=0; i<n; i++) {
            st.add(pushed[i]);
            while(!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        return j==n && st.isEmpty();
    }
}
