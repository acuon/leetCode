//https://leetcode.com/problems/3sum-with-multiplicity/

class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long[] nums = new long[101];
        long count = 0;
        for(int i: arr) nums[i]++;
        for(int i=0; i<101; i++) {
            for(int j=i; j<101; j++) {
                int k = target-i-j;
                if(k<0 || k>100) continue;
                if(i==j && j==k)  {
                    count += nums[i]*(nums[i]-1)*(nums[i]-2)/6;
                } else if(i==j && j!=k) {
                    count += nums[i]*(nums[i]-1)/2*nums[k];
                } else if(j<k) {
                    count += nums[i]*nums[j]*nums[k];
                }
            }
        }
        return (int)(count%(1e9 + 7));
    }
}
