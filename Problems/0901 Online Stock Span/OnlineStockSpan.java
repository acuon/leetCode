//https://leetcode.com/problems/online-stock-span/

class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while (!stack.empty()) {
            if (stack.peek()[0] <= price) {
                span += stack.pop()[1];
            } else {
                break;
            }
        }
        stack.add(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
