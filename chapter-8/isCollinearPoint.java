/*
* Returns whether this Point is collinear with the given two other points. Points are 
* collinear if a straight line can be drawn that connects them. Two basic examples are 
* three points that have the same x- or y-coordinate. The more general case can be determined 
* by calculating the slope of the line between each pair of points and checking whether this 
* slope is the same for all pairs of points. Use the formula (y2 - y1) / (x2 - x1) to 
* determine the slope between two points (x1, y1) and (x2, y2). (Note that this formula fails 
* for points with identical x-coordinates so this will have to be special-cased in your 
* code.) 
*/

public class Point {
    private int x;
    private int y;
    
    public boolean isCollinear(Point p1, Point p2) {
        if ((this.x == p1.x && this.x == p2.x) || (this.y == p1.y && this.y == p2.y)) {
            return true;
        } else {
            double slope1 = (double)(this.y - p1.y) / (double)(this.x - p1.x);
            double slope2 = (double)(this.y - p2.y) / (double)(this.x - p2.x);
            return slope1 == slope2;
        }    
    }
}
