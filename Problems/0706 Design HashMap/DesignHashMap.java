//https://leetcode.com/problems/design-hashmap/

class MyHashMap {
    
    int[] arr;
    int size = 1;

    /** Initialize your data structure here. */
    public MyHashMap() {
        arr = new int[size];
        Arrays.fill(arr, -1);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        if(key>=size) {
            int[] temp = new int[key+1];
            Arrays.fill(temp, -1);
            System.arraycopy(arr, 0, temp, 0, size);
            size = temp.length;
            arr = temp;
        }
        arr[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(key>=size) return -1;
        return arr[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if(key>=size) return;
        arr[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
