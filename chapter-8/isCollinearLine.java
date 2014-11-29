/*
* Add the following method to your Line class:
* 
* public boolean isCollinear(Point p)
* 
* Returns true if the given point is collinear with the points of this line; that is, 
* if, when this Line is stretched infinitely, it would eventually hit the given point. Points 
* are collinear if a straight line can be drawn that connects them. Two basic examples are 
* three points that have the same x- or y-coordinate. The more general case can be determined 
* by calculating the slope of the line between each pair of points and checking whether this 
* slope is the same for all pairs of points. Use the formula (y2 - y1) / (x2 - x1) to 
* determine the slope between two points (x1, y1) and (x2, y2). 
*/

public boolean isCollinear(Point p) {
    double slope1 = (double)(p1.getY() - p.getY()) / (p1.getX() - p.getX());
    double slope2 = (double)(p2.getY() - p.getY()) / (p2.getX() - p.getX());
    return slope1 == slope2;
}
