//https://leetcode.com/problems/implement-queue-using-stacks/description/

class MyQueue {

    private Stack<Integer> main;
    private Stack<Integer> temp;

    public MyQueue() {
        main = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        peek();
        return temp.pop();
    }

    public int peek() {
        if (temp.empty()) {
            while (!main.empty()) {
                temp.push(main.pop());
            }
        }
        return temp.peek();
    }

    public boolean empty() {
        return main.empty() && temp.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
