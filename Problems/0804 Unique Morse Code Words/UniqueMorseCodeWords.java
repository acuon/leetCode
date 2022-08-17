//https://leetcode.com/problems/unique-morse-code-words/

class Solution {
    private String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> transformations = new HashSet<>();
        for (String word : words) {
            transformations.add(convertToMorse(word));
        }
        return transformations.size();
    }

    private String convertToMorse(String word) {
        StringBuilder morseCode = new StringBuilder();
        for (char ch : word.toCharArray()) {
            morseCode.append(morse[ch-'a']);
        }
        return morseCode.toString();
    }
}
