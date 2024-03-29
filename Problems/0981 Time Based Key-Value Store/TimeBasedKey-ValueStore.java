//https://leetcode.com/problems/time-based-key-value-store/

class TimeValue {
    String val;
    int timestamp;
    
    public TimeValue(String val, int time){
        this.val = val;
        timestamp = time;
    }
}
class TimeMap {
    Map<String, List<TimeValue>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(new TimeValue(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        List<TimeValue> list = map.getOrDefault(key, null);
        if(list == null) return "";
        int low = 0, high = list.size()-1;
        if(list.get(low).timestamp > timestamp) return "";
        if(list.get(high).timestamp <= timestamp) return list.get(high).val;
        while(low < high){
           int mid = (low + high) / 2;
           if(list.get(mid).timestamp == timestamp) return list.get(mid).val;
           if(list.get(mid).timestamp < timestamp) low = mid + 1;
           else high = mid - 1;
            
        }
        return list.get(low - 1).val;
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
