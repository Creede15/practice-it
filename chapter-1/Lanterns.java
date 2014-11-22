/* Write a complete Java program in a class named Lanterns that generates the
* following three figures of output. Use static methods to show structure and
* eliminate redundancy in your solution.
*       *****
*     *********
*   *************
*
*       *****
*     *********
*   *************
*   * | | | | | *
*   *************
*       *****
*     *********
*   *************
*
*       *****
*     *********
*   *************
*       *****
*   * | | | | | *
*   * | | | | | *
*       *****
*       *****
*/

public class Lanterns {
    public static void main(String[] args){
        top1();
        top();
        body1();
        top1();
        top();
        body2();
    }
    
    public static void top() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    
    public static void top1() {
        top();
        System.out.println();
    }
    
    public static void body1() {
        System.out.println("* | | | | | *");
        System.out.println("*************");
    }
    
    public static void body2() {
        System.out.println("    *****");
        System.out.println("* | | | | | *");
        System.out.println("* | | | | | *");
        System.out.println("    *****");
        System.out.println("    *****");
    }
}
