//https://leetcode.com/problems/the-skyline-problem/

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> result = new ArrayList<>();
        if (buildings.length == 1) {
            List<Integer> temp = new ArrayList<>();
            temp.add(buildings[0][0]);
            temp.add(buildings[0][2]);
            result.add(temp);
            List<Integer> temp2 = new ArrayList<>();
            temp2.add(buildings[0][1]);
            temp2.add(0);
            result.add(temp2);
            return result;
        }
        // Arrays.sort(buildings, new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] a, int[] b) {
        //         return a[0] - b[0];
        //     }
        // });
        int maxIndex = 0;
        for (int i = 0; i < buildings.length; i++) {
            maxIndex = Math.max(maxIndex, buildings[i][1]);
        }
        int prev = 0, flag = 0;
        for (int i = 0; i < maxIndex + 1; i++) {
            int maxheight = 0;
            for (int j = 0; j < buildings.length; j++) {
                if (buildings[j][0] > i) break;
                if (i >= buildings[j][0] && i < buildings[j][1]) {
                    maxheight = Math.max(maxheight, buildings[j][2]);
                }
            }
            if (maxheight != prev) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(maxheight);
                result.add(temp);
            }
            flag = 1;
            prev = maxheight;
        }
        if (flag == 0) {
            for (int i = 0; i < buildings.length; i++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(buildings[i][0]);
                temp.add(buildings[i][2]);
                result.add(temp);
                List<Integer> temp2 = new ArrayList<>();
                temp2.add(buildings[i][1]);
                temp2.add(0);
                result.add(temp2);
            }
        }
        return result;
    }
}
