//https://leetcode.com/problems/top-k-frequent-words/

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> arr = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> que = new PriorityQueue<>((a, b) -> (a.getValue().equals(b.getValue())) ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for(Map.Entry<String, Integer> m: map.entrySet()) {
            que.add(m);
            if(que.size() > k) que.poll();
        }
        while (!que.isEmpty()) {
            arr.add(0, que.poll().getKey());
        }
        return arr;
    }
}
