/*
* Negates and swaps the x/y coordinates of the Point object. For example, if the object initially 
* represents the point (5, -3), after a call to flip, the object should represent (3, -5). If the
* object initially represents the point (4, 17), after a call to flip, the object should represent 
* (-17, -4). 
*/


public class Point {
    private int x;
    private int y;
    
    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }
    
}
