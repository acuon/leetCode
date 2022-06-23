//https://leetcode.com/problems/course-schedule-iii/

class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b) -> Integer.compare(a[1], b[1]));
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->(b-a));
        int time = 0;
        for(int[] course: courses) {
            time += course[0];
            que.add(course[0]);
            if(time > course[1]) {
                time -= que.poll();
            }
        }
        return que.size();
    }
}
