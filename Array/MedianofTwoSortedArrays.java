/*
//https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000

Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000

Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000

 

Constraints:

    nums1.length == m
    nums2.length == n
    0 <= m <= 1000
    0 <= n <= 1000
    1 <= m + n <= 2000
    -10^6 <= nums1[i], nums2[i] <= 10^6

*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length>nums2.length?nums1.length:nums2.length;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0; i<n; i++) {
            if(i<nums1.length) {
                ar.add(nums1[i]);
            }
            if(i<nums2.length) {
                ar.add(nums2[i]);
            }
        }
        Collections.sort(ar);
        double median = 0.0;
        int size = ar.size();
        if(size%2==0) {
            median = (ar.get(size/2) + ar.get((size/2)-1));
            median = median/2;
        }
        if(size%2==1) {
            median = ar.get((size-1)/2);
        }
        
        return median;
    }
}

//less time complexity
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        ArrayList<Integer> arr = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        int k = 0;
        int limit = (n)/2 + 1;
        
        while (i < nums1.length && j < nums2.length && k < limit) {
            if (nums1[i] < nums2[j]) {
                arr.add(nums1[i]);
                i++;
            }
            else {
                arr.add(nums2[j]);
                j++;
            }
            k++;
        }
        
        if (i < nums1.length) {
            while (i < nums1.length && k < limit) {
                arr.add(nums1[i]);
                i++;
                k++;
            }
        }
        else {
            while (j < nums2.length && k < limit) {
                arr.add (nums2[j]);
                j++;
                k++;
            }
        }
        
        k--;
        
        return n%2 == 0 ? (double) (arr.get(k - 1) + arr.get(k)) / 2.0 : (double) arr.get(k);
    }
}
