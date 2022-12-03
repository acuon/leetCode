//https://leetcode.com/problems/sort-characters-by-frequency/

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int[][] arr = new int[map.size()][2];
        int i = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            arr[i][0] = entry.getKey();
            arr[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        StringBuilder ans = new StringBuilder();
        for(int[] ar: arr) {
            while(ar[1]-- > 0) ans.append((char)ar[0]);
        }
        return ans.toString();
    }
}
