//https://leetcode.com/problems/design-underground-system/

class UndergroundSystem {
    
    //HashMap<id, Pair<startStation, time>>
    HashMap<Integer, Pair<String, Integer>> checkIn;
    //HashMap<route, Pair<totalTime, travelCount>>
    HashMap<String, Pair<Integer, Integer>> checkOut;
    
    public UndergroundSystem() {
        checkIn = new HashMap<>();
        checkOut = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkIn.put(id, new Pair<>(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> checkInDetails = checkIn.get(id);
        String route = checkInDetails.getKey()+"-"+stationName;
        int timeTaken = t-checkInDetails.getValue();
        Pair<Integer, Integer> routeDetails = checkOut.getOrDefault(route, new Pair<>(0, 0));
        checkOut.put(route, new Pair<>(routeDetails.getKey()+timeTaken, routeDetails.getValue()+1));
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String route = startStation+"-"+endStation;
        Pair<Integer, Integer> trip = checkOut.get(route);
        return (trip.getKey()*1.0)/trip.getValue();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
