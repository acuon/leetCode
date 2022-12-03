//https://leetcode.com/problems/sort-characters-by-frequency/

class Solution {
    public String frequencySort(String s) {
        int[][] arr = new int[256][2];
        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i)][0] = s.charAt(i);
            arr[s.charAt(i)][1]++;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        StringBuilder ans = new StringBuilder();
        for(int[] ar: arr) {
            if(ar[0] > 0) ans.append(String.valueOf((char)ar[0]).repeat(ar[1]));
        }
        return ans.toString();
    }
}
