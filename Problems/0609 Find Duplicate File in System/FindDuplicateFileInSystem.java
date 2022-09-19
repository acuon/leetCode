//https://leetcode.com/problems/find-duplicate-file-in-system/

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> list = new ArrayList<>();
        Map<String, Set<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] arr = path.split(" ");
            StringBuilder root = new StringBuilder(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                String[] file = arr[i].split("\\(");
                StringBuilder filePath = new StringBuilder();
                filePath.append(root).append("/").append(file[0]);
                Set<String> set;
                if (map.containsKey(file[1])) {
                    set = map.get(file[1]);
                } else {
                    set = new HashSet<>();
                }
                set.add(filePath.toString());
                map.put(file[1], set);
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().size() > 1) {
                list.add(new ArrayList<String>(entry.getValue()));
            }
        }
        return list;
    }
}
