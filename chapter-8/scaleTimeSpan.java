/*
* Scales this time span by the given factor. For example, 1 hour and 
* 45 minutes scaled by 2 equals 3 hours and 30 minutes. 
*/

public class TimeSpan {
    private int hours;
    private int minutes;
    
    public void add(int hours, int minutes) { ... }
    public int getHours() { ... }
    public int getMinutes() { ... }
    public String toString() { ... }

    public void scale(int factor) {
        this.hours = this.minutes * factor / 60 + factor * this.hours;
        this.minutes = this.minutes * factor % 60;
    }
}
