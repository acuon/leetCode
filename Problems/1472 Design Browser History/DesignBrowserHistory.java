//https://leetcode.com/problems/design-browser-history/

class DoublyLinkedList {
    String url;
    DoublyLinkedList prev, next;
    public DoublyLinkedList(String url) {
        this.url = url;
        prev = null;
        next = null;
    }
}

class BrowserHistory {

    DoublyLinkedList head, newNode;
    public BrowserHistory(String homepage) {
        newNode = new DoublyLinkedList(homepage);
        head = newNode;
    }
    
    public void visit(String url) {
        DoublyLinkedList temp = new DoublyLinkedList(url);
        temp.prev = head;
        head.next = temp;
        head = temp;
    }
    
    public String back(int steps) {
        while(head.prev!=null && steps-->0) {
            head = head.prev;
        }
        return head.url;
    }
    
    public String forward(int steps) {
        while(head.next!=null && steps-->0) {
            head = head.next;
        }
        return head.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
