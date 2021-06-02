/*
Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.

A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

    0 <= i < j < k < arr.length
    |arr[i] - arr[j]| <= a
    |arr[j] - arr[k]| <= b
    |arr[i] - arr[k]| <= c

Where |x| denotes the absolute value of x.

Return the number of good triplets.

 

Example 1:

Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
Output: 4
Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].

Example 2:

Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
Output: 0
Explanation: No triplet satisfies all conditions.

 

Constraints:

    3 <= arr.length <= 100
    0 <= arr[i] <= 1000
    0 <= a, b, c <= 1000
*/


class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int ans = 0;
        int[] pre = new int[1001];
        int[] post = new int[1001];  // stores suffix sum
        pre[arr[0]] = 1;
        for(int i = n-1; i > 1; i--) {
            post[arr[i]]++;
        }
        for(int i = 1; i <= 1000; i++) {
            post[i] = post[i-1] + post[i];
        }
        
        for(int j = 1; j < n-1; j++) {
            int v = arr[j];
            int p1 = Math.max(0, v-a);
            int p2 = Math.min(1000, v+a);
            int t1 = Math.max(0, v-b);
            int t2 = Math.min(1000, v+b);
            
            for(int s = p1; s <= p2; s++) {
                if (pre[s] == 0) continue;
                int m1 = Math.max(t1, s-c);
                int m2 = Math.min(t2, s+c);
                if (m2 >= m1) {
                    if (m1 == 0) {
                        ans += pre[s] * post[m2];
                    } else {
                        ans += pre[s] * (post[m2] - post[m1-1]);
                    }
                }
            }
            pre[v]++;
            for(int i = arr[j+1]; i <= 1000; i++) {
                post[i]--;
            }
        }
        return ans;
    }
}

/*
Brute Force

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i=0; i<arr.length-2; i++) {
            for(int j=i+1; j<arr.length-1; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c) {
                        System.out.println("("+i+","+j+","+k+")");
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
*/
