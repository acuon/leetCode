//https://leetcode.com/problems/interleaving-string/

class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        
        // coordinates are of the form [i, j], corresponding to the indexes in s1, s2
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, 0});
		
        boolean[][] visited = new boolean[s1.length()+1][s2.length()+1];
        
        while (!stack.empty()) {
            int[] indexes = stack.pop();
            int i = indexes[0], j = indexes[1];
            visited[i][j] = true;
			
			// we're at the bottom-rightmost coordinate; we're done!
            if (i == s1.length() && j == s2.length()) {
                return true;
            }
            
			// check if we can increment i (traveling right on the graph)
            if (i<s1.length() && !visited[i+1][j] && s1.charAt(i) == s3.charAt(i+j)) {
                stack.push(new int[] {i + 1, j});
            }
            
			// check if we can increment j (traveling down on the graph)
            if (j<s2.length() && !visited[i][j+1] && s2.charAt(j) == s3.charAt(i+j)) {
                stack.push(new int[] {i, j + 1});
            }
        }
        return false;
    }
}
