/*
* Add the following method to your Rectangle class:
* 
* public Rectangle intersection(Rectangle rect)
* 
* Returns a new rectangle that represents the largest rectangular region completely contained 
* within both this rectangle and the given other rectangle. If the rectangles do not intersect 
* at all, returns null. Your method should not modify the current Rectangle or the one 
* that is passed in as a parameter; you should create and return a new rectangle. 
*/

public Rectangle intersection(Rectangle rect) {
    int left = Math.max(this.x, rect.x);
    int top = Math.max(this.y, rect.y);
    int right = Math.min(this.x + this.width, rect.x + rect.width);
    int bottom = Math.min(this.y + this.height, rect.y + rect.height);
    int width = Math.max(0, right - left);
    int height = Math.max(0, bottom - top);
        
    return new Rectangle(left, top, width, height);
}
