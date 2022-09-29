//https://leetcode.com/problems/find-k-closest-elements/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                pos = i;
            }
        }
        if(pos >= 0 && (pos+1) < arr.length && Math.abs(x-arr[pos]) >= Math.abs(x-arr[pos+1])) {
            pos++;
        }
        int i = pos - 1;
        int j = pos;
        while (k-- > 0) {
            int left = (i >= 0) ? Math.abs(x - arr[i]) : Integer.MAX_VALUE;
            int right = (j < arr.length) ? Math.abs(x - arr[j]) : Integer.MAX_VALUE;
            if (left == Integer.MAX_VALUE && right == Integer.MAX_VALUE) break;
            if (left < right) {
                que.offer(arr[i]);
                i--;
            } else if (right < left) {
                que.offer(arr[j]);
                j++;
            } else {
                if (arr[i] < arr[j]) {
                    que.offer(arr[i]);
                    i--;
                } else {
                    que.offer(arr[j]);
                    j++;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        while(!que.isEmpty()) {
            list.add(que.poll());
        }
        return list;
    }
}
