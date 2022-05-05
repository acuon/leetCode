//https://leetcode.com/problems/implement-stack-using-queues/

class MyStack {

    Queue<Integer> main;

    public MyStack() {
        main = new LinkedList<>();
    }

    public void push(int x) {
        main.add(x);
        for(int i=1; i<main.size(); i++) {
            main.add(main.remove());
        }
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
