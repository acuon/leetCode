//https://leetcode.com/problems/find-median-from-data-stream/

class MedianFinder {

    ArrayList<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i;
        if(list.size() > 0){
            for (i = 0; (i < list.size()  && list.get(i) < num); i++);
            if(i == -1){
                i = 0;
            }
            list.add(i , num);
        } else {
            list.add(num);
        }
    }
    
    public double findMedian() {
        int idx = list.size()/2;
        if(list.size() % 2 == 0){
            return (double) (list.get(idx) + list.get(idx - 1))/2;
        } else {
            return list.get(idx);
        }       
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
