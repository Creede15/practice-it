/* Write a program in a class named Shining that prints the following line of
* output 1000 times:
* All work and no play makes Jack a dull boy.
*/

public class Shining {
    public static void main(String[] args){
        thousands();
    }
    
    public static void ten() {
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
    }
    
    public static void hundreds() {
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
    }
    
    public static void thousands(){
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
        hundreds();
    }
}
