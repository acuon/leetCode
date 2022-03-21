//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/submissions/

class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
        // Max Heap
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> (a[1] != b[1] ? b[1] - a[1] : b[0] - a[0]));

        for (int i = 0; i < mat.length; i++) {
            queue.offer(new int[] { i, getSoldierCount(mat[i]) });
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] result = new int[k];
        while (!queue.isEmpty()) {
            result[--k] = queue.poll()[0];
        }
        return result;
    }

    private int getSoldierCount(int[] row) {
        if (row[0] == 0) {
            return 0;
        }
        if (row[row.length - 1] == 1) {
            return row.length;
        }
        int start = 0;
        int end = row.length; // Number of solder can be maximum row.length. Thus end needs to be row.length

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (row[mid] == 1) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }
}
