//https://leetcode.com/problems/top-k-frequent-words/
//https://leetcode.com/problems/top-k-frequent-words/discuss/2721791/Java-Solution-or-HashMap-+-PriorityQueue

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> arr = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> que = new PriorityQueue<>(new MyComparator());
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        que.addAll(map.entrySet());
        while (k-- > 0) {
            arr.add(Objects.requireNonNull(que.poll()).getKey());
        }
        return arr;
    }
}
class MyComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
        if (a.getValue().equals(b.getValue())) {
            return a.getKey().compareTo(b.getKey());
        } else {
            return b.getValue() - a.getValue();
        }
    }
}
