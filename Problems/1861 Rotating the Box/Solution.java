class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] arr = new char[n][m];
        for(char[] ar: arr) {
            Arrays.fill(ar, '.');
        }
        int idx_j = m-1;
        for(int i=0; i<m; i++, idx_j--) {
            int idx_i = n-1;
            for(int j=n-1; j>=0; j--) {
                if(box[i][j] == '*') {
                    idx_i = j;
                    arr[idx_i--][idx_j] = '*';
                } else if(box[i][j] == '#') {
                    arr[idx_i--][idx_j] = '#';
                } else continue;
            }
        }

        return arr;
    }
}
/*
00 01 02 03
10 11 12 13


00 01
10 11
20 21 
30 31

*/
