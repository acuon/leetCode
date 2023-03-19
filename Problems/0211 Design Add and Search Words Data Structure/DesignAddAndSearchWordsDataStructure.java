//https://leetcode.com/problems/design-add-and-search-words-data-structure/description/

class WordDictionary {
    private Set<String> wordsSet;
    private Map<Integer, List<String>> wordsMap;

    public WordDictionary() {
        wordsSet = new HashSet();
        wordsMap = new HashMap<>();
    }

    public void addWord(String word) {
        wordsSet.add(word);
        int len = word.length();
        List<String> listWord = new ArrayList();
        if (wordsMap.containsKey(len)) {
            listWord = wordsMap.get(len);
        }
        listWord.add(word);
        wordsMap.put(len, listWord);
    }

    public boolean search(String word) {
        if (wordsSet.contains(word)) return true;
        if (!word.contains(".") && !wordsSet.contains(word)) return false;

        List<String> words;
        if (wordsMap.containsKey(word.length())) {
            words = wordsMap.get(word.length());
        } else {
            return false;
        }
        for (String str: words) {
            boolean present = true;
            for (int i=0; i<word.length(); i++) {
                if (word.charAt(i) == '.') continue;
                if (str.charAt(i) != word.charAt(i)) {
                    present = false;
                    break;
                }
            }
            if (present) return true;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
