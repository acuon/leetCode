//https://leetcode.com/problems/valid-sudoku/

class Solution {
    public boolean isValidSudoku(char[][] board) {
        /*
        00 01 02 03 04 05 06 07 08
        10 11 12 13 14 15 16 17 18
        20 21 22 23 24 25 26 27 28
        30 31 32 33 34 35 36 37 38
        40 41 42 43 44 45 46 47 48
        50 51 52 53 54 55 56 57 58
        60 61 62 63 64 65 66 67 68
        70 71 72 73 74 75 76 77 78
        80 81 82 83 84 85 86 87 88
        */
        int n = board.length;
        for(int i=0; i<n; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for(int j=0; j<n; j++) {
                if(board[i][j]!='.' && !row.add(board[i][j])) {
                    // System.out.println(i+" "+j);
                    return false;
                }
                if(board[j][i]!='.' && !col.add(board[j][i])) {
                    // System.out.println(i+" "+j);
                    return false;
                }
            }
        }
        /*
        00 03 06
        30 33 36
        60 63 66
        */
        for(int r=0; r<n/3; r++) {
            for(int c=0; c<n/3; c++) {
                HashSet<Character> block = new HashSet<>();
                for(int i=r*3; i<(r+1)*3; i++) {
                    for(int j=c*3; j<(c+1)*3; j++) {
                        // System.out.print(board[i][j]+" ");
                        if(board[i][j]!='.' && !block.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
