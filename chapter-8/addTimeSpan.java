/*
* Adds the given amount of time to this time span. 
*/

public class TimeSpan {
    private int hours;
    private int minutes;
    
    public void add(int hours, int minutes) { ... }
    public int getHours() { ... }
    public int getMinutes() { ... }
    public String toString() { ... }

    public void add(TimeSpan span) {
        this.minutes += span.minutes;
        this.hours += span.hours + this.minutes / 60;
        this.minutes %= 60;
    }
}
