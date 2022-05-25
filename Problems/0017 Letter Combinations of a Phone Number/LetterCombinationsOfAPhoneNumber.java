//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> map = new ArrayList<>(Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"));
        if(digits.length()==0) return new ArrayList<String>();
        List<String> temp = new ArrayList<>();
        temp.add("");
        for(int i=digits.length()-1; i>=0; i--) {
            temp = getCurrentCombinations(map.get(digits.charAt(i)-'0'), temp);
        }
        return temp;
    }
    public List<String> getCurrentCombinations(String cur, List<String> prev) {
        ArrayList<String> comb = new ArrayList<>();
        for(int i=0; i<cur.length(); i++) {
            for(int j=0; j<prev.size(); j++) {
                comb.add(cur.charAt(i)+prev.get(j));
            }
        }
        return comb;
    }
}
