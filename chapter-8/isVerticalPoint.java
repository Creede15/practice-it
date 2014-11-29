/* 
* Returns true if the given Point lines up vertically with this Point; 
* that is, if their x coordinates are the same. 
*/

public class Point {
    private int x;
    private int y;
    
    public boolean isVertical(Point p) {
        return this.x == p.x;
    }
}
