//https://leetcode.com/problems/lexicographical-numbers/

class Solution {
     public List<Integer> lexicalOrder(int n) {
        List<Integer> arr = new ArrayList<>(n);
        //  from  1 to 9.
        //  0 is can't be a soution.
        addNumbers(1, 9, n, arr);
        return arr;
    }
    private void addNumbers(int start, int end, int n, List<Integer> arr){
        // <= n make the solution can't bigger than n
        for (int i = start; i <= end && i <= n; i++){
            arr.add(i);
            // 10 -> next recursion: 100(->next recursion 1000), 101,102....
            // next loop: 11 -> next recursion: 110,  111,112....
            // next loop: 12 -> next recursion: 120,  121,122....
            // from 0 to 9 different from the dfs call in method lexicalOrder
            addNumbers(i * 10, i * 10 + 9, n, arr);
        }
    }
}
