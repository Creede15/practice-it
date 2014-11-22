/*
* Write a complete Java program in a class named TwoRockets that generates the following output.
* Use static methods to show structure and eliminate redundancy in your solution.
*
*    /\       /\
*   /  \     /  \
*  /    \   /    \
* +------+ +------+
* |      | |      |
* |      | |      |
* +------+ +------+
* |United| |United|
* |States| |States|
* +------+ +------+
* |      | |      |
* |      | |      |
* +------+ +------+
*    /\       /\
*   /  \     /  \
*  /    \   /    \
*/

public class TwoRockets {
    public static void main(String[] args) {
        top();
        body();
        word();
        body();
        top();
    }
    
    public static void top() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    
    public static void body() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    
    public static void word() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
