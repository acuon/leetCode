//https://leetcode.com/problems/push-dominoes/

class Solution {
    public String pushDominoes(String dominoes) {
        dominoes = 'L' + dominoes + 'R';
        StringBuilder res = new StringBuilder();
        for (int i = 0, j = 1; j < dominoes.length(); ++j) {
            if (dominoes.charAt(j) == '.') continue;
            int middle = j - i - 1;
            if (i > 0)
                res.append(dominoes.charAt(i));
            if (dominoes.charAt(i) == dominoes.charAt(j))
                for (int k = 0; k < middle; k++)
                    res.append(dominoes.charAt(i));
            else if (dominoes.charAt(i) == 'L' && dominoes.charAt(j) == 'R')
                for (int k = 0; k < middle; k++)
                    res.append('.');
            else {
                for (int k = 0; k < middle / 2; k++)
                    res.append('R');
                if (middle % 2 == 1)
                    res.append('.');
                for (int k = 0; k < middle / 2; k++)
                    res.append('L');
            }
            i = j;
        }
        return res.toString();
    }
}
