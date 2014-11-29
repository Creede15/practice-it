/*
* Add the following constructor to your Rectangle class from the previous exercise: 
* 
* public Rectangle(Point p, int width, int height)
* 
* Constructs a new rectangle whose top-left corner is specified by the given point and 
* with the given width and height. 
*/

public Rectangle(Point p, int width, int height) {
    this(p.getX(), p.getY(), width, height);
}
