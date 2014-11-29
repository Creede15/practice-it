/*
* Add the following method to your Line class:
* 
* public double getSlope()
* 
* Returns the slope of this line. The slope of a line between points (x1, y1) and (x2, 
* y2) is equal to (y2 - y1) / (x2 - x1). If the two points have the same x-coordinates, 
* the denominator is zero and the slope is undefined, so you should throw an 
* IllegalStateException in this case. 
*/

public double getSlope() {
    double x1 = p1.getX();
    double x2 = p2.getX();
    double y1 = p1.getY();
    double y2 = p2.getY();
    if (x1 == x2) {
        throw new IllegalStateException();
    } else if (y1 == y2) {
        return 0;
    } else {
        return (y2 - y1) / (x2 - x1);
    }
}
