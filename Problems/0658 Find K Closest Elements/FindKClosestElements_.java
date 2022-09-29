//https://leetcode.com/problems/find-k-closest-elements/

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - k;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (x * 2 - arr[mid] - arr[mid + k] > 0) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = start; i < start + k; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
