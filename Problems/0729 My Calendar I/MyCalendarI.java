//https://leetcode.com/problems/my-calendar-i/

class MyCalendar {
    
    List<Event> events;
    
    public MyCalendar() {
        events = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(Event event: events) {
            if(Math.max(event.start, start) < Math.min(event.end, end)) return false;
        }
        events.add(new Event(start, end));
        return true;
    }
}
class Event {
    public int start;
    public int end;
    public Event(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
