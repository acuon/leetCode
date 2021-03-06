//https://leetcode.com/problems/furthest-building-you-can-reach/

class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        //https://leetcode.com/problems/furthest-building-you-can-reach/discuss/2176616/Visual-Explanation-or-JAVA-Max-Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<heights.length-1; i++) {
            if (heights[i] >= heights[i+1]) continue;
            bricks -= heights[i+1] - heights[i];
            pq.add(heights[i+1] - heights[i]);

            if (bricks < 0) {
                bricks += pq.poll();
                if (ladders > 0) ladders--;
                else return i;
            }
        }

        return heights.length - 1;
    }
}
