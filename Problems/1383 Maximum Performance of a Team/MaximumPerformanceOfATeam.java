//https://leetcode.com/problems/maximum-performance-of-a-team/

class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[]{efficiency[i], speed[i]};
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> (a-b));
        long res = 0;
        long sumS = 0;
        for (int[] eng : arr) {
            pq.add(eng[1]);
            sumS = (sumS + eng[1]);
            if (pq.size() > k) {
                sumS -= pq.poll();
            }
            res = Math.max(res, (sumS * eng[0]));
        }
        return (int) (res % (long) (1e9 + 7));
    }
}
