//https://leetcode.com/problems/baseball-game/

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String str: ops) {
            switch (str) {
                case "C" -> {
                    sum -= st.pop();
                }
                case "D" -> {
                    st.push(st.peek() * 2);
                    sum += st.peek();
                }
                case "+" -> {
                    int temp = st.pop();
                    int next = temp + st.peek();
                    st.push(temp);
                    st.push(next);
                    sum += st.peek();
                }
                default -> {
                    st.push(Integer.parseInt(str));
                    sum += st.peek();
                }
            }
        }
        return sum;
    }
}
