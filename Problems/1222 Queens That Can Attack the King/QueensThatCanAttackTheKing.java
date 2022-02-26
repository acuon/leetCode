//https://leetcode.com/problems/queens-that-can-attack-the-king/

class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] board = new int[8][8];
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0; i<queens.length; i++) {
            board[queens[i][0]][queens[i][1]] = 1;
        }
        // for(int[] ar: board) {
        //     for(int i: ar) System.out.print(i+" ");
        //     System.out.println();
        // }
        //up left diagonal
        for(int i=king[0], j=king[1]; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 1) {
                arr.add(List.of(i, j)); 
                break;
            }
        }
        //up right diagonal
        for(int i=king[0], j=king[1]; i>=0 && j<8; i--, j++) {
            if(board[i][j] == 1) {
                arr.add(List.of(i, j));
                break;
            }
        }
        //down left diagonal
        for(int i=king[0], j=king[1]; i<8 && j>=0; i++, j--) {
            if(board[i][j] == 1) {
                arr.add(List.of(i, j));
                break;
            }
        }
        //down right diagonal
        for(int i=king[0], j=king[1]; i<8 && j<8; i++, j++) {
            if(board[i][j] == 1) {
                arr.add(List.of(i, j));
                break;
            }
        }
        //left
        for(int j=king[1]; j>=0; j--) {
            if(board[king[0]][j] == 1) {
                arr.add(List.of(king[0], j));
                break;
            }
        }
        //right
        for(int j=king[1]; j<8; j++) {
            if(board[king[0]][j] == 1) {
                arr.add(List.of(king[0], j));
                break;
            }
        }
        //up
        for(int i=king[0]; i>=0; i--) {
            if(board[i][king[1]] == 1) {
                arr.add(List.of(i, king[1]));
                break;
            }
        }
        //down
        for(int i=king[0]; i<8; i++) {
            if(board[i][king[1]] == 1) {
                arr.add(List.of(i, king[1]));
                break;
            }
        }
        return arr;
    }
}
