//https://leetcode.com/problems/game-of-life/

class Solution {
    public void gameOfLife(int[][] arr) {
        int[][] res = new int[arr.length][arr[0].length];
        int m = arr.length-1;
        int n = arr[0].length-1;
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                int count = 0;
                if(i>0 && arr[i-1][j] == 1) count++;
                if(j>0 && arr[i][j-1] == 1) count++;
                if(i<m && j<n && arr[i+1][j+1] == 1) count++;
                if(i<m && j>0 && arr[i+1][j-1] == 1) count++;
                if(i>0 && j<n && arr[i-1][j+1] == 1) count++;
                if(i>0 && j>0 && arr[i-1][j-1] == 1) count++;
                if(i<m && arr[i+1][j] == 1) count++;
                if(j<n && arr[i][j+1] == 1) count++;
                
                if(arr[i][j] == 1){
                    if(count<2) res[i][j] = 0;
                    else if(count>3) res[i][j] = 0;
                    else res[i][j] = 1;
                }else{
                    if(count == 3) res[i][j] = 1;
                }
            }
        }
        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                arr[i][j] = res[i][j];
            }
        }
    }
}
