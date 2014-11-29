/*
* Returns the slope of the line drawn between this Point and the given other Point. Use 
* the formula (y2 - y1) / (x2 - x1) to determine the slope between two points (x1, y1) 
* and (x2, y2). Note that this formula fails for points with identical x-coordinates, so 
* throw an IllegalArgumentException in this case. 
*/

public class Point {
    private int x;
    private int y;
    
    public double slope(Point p) {
        if (this.x == p.x) {
            throw new IllegalArgumentException();
        } else {
            double dy = (double)(this.y - p.y);
            double dx = (double)(this.x - p.x);
            return dy / dx;
        }
    }
}
