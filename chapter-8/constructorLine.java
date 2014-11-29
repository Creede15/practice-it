/*
* Add the following constructor to your Line class from the preceding exercises:
* 
* public Line(int x1, int y1, int x2, int y2)
* 
* Constructs a new line that contains the given two points. 
*/

public Line(int x1, int y1, int x2, int y2) {
    p1 = new Point(x1, y1);
    p2 = new Point(x2, y2);
}
