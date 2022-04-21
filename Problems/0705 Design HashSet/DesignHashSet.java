//https://leetcode.com/problems/design-hashset/

class MyHashSet {
    
    ArrayList<Integer> arr;

    /** Initialize your data structure here. */
    public MyHashSet() {
        arr = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key)) arr.add(key);
    }
    
    public void remove(int key) {
        if(contains(key)) {
            arr.remove(new Integer(key));
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for(int i: arr) if(i==key) return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
