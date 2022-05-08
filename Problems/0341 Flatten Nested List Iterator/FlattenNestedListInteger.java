//https://leetcode.com/problems/flatten-nested-list-iterator/

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    ArrayList<Integer> arr;
    int idx = 0;
    public NestedIterator(List<NestedInteger> nestedList) {
        arr = new ArrayList<>();
        for(NestedInteger i: nestedList) {
            flattenList(i);
        }
    }
    
    public void flattenList(NestedInteger num) {
        if(num.isInteger()) {
            arr.add(num.getInteger());
        } else {
            for(NestedInteger i: num.getList()) {
                flattenList(i);
            }
        }
    }

    @Override
    public Integer next() {
        return arr.get(idx++);
    }

    @Override
    public boolean hasNext() {
        return idx<arr.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
