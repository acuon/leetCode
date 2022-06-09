//https://leetcode.com/problems/find-the-distance-value-between-two-arrays/

class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i: arr1) {
            if(!contains(arr2, i-d, i+d)) {
                count++;
            }
        }
        return count;
    }
    public boolean contains(int[] arr, int left, int right) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(arr[mid] <= right && arr[mid]>=left) {
                return true;
            } else if(arr[mid] < left) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
