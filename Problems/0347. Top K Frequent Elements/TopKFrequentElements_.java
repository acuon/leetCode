//https://leetcode.com/problems/top-k-frequent-elements/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i: nums) {
            frequency.put(i, frequency.getOrDefault(i, 0)+1);
        }
        int max = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int key : frequency.keySet()) {
            int newKey = frequency.get(key);
            max = Math.max(max, newKey);
            if (map.containsKey(newKey)) {
                ArrayList<Integer> temp = map.get(newKey);
                temp.add(key);
                map.put(newKey, temp);
            } else {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(key);
                map.put(newKey, arr);
            }
        }
        // System.out.println(map);
        int[] arr = new int[max+1];
        int[] res = new int[k];
        for(int key: map.keySet()) {
            arr[key]++;
        }
        int idx = 0;
        for(int i=arr.length-1; i>=0 && idx<k; i--) {
            if(arr[i]==1) {
                ArrayList<Integer> temp = map.get(i);
                int j = 0;
                while(j<temp.size() && idx<k) {
                    res[idx++] = temp.get(j++);
                }
            }
        }
        return res;
    }
}
