//https://leetcode.com/problems/last-stone-weight/

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->(b-a));
        for(int i: stones) que.add(i);
        System.out.println(que);
        while(que.size()>1) {
            que.add(que.poll()-que.poll());
        }
        return que.poll();
    }
}
