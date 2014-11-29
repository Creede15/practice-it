/*
* Write a class called Rectangle that represents a rectangular two-dimensional region.
*/

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    
    public Rectangle(int x, int y, int width, int height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public String toString() {
        return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
    }
}
