* Write a complete Java program in a class named StarFigures that generates the following output. 
* Use static methods to show structure and eliminate redundancy in your solution.
*
*   *****
*   *****
*    * *
*     *
*    * *
*
*   *****
*   *****
*    * *
*     *
*    * *
*   *****
*   *****
*
*     *
*     *
*     *
*   *****
*   *****
*    * *
*     *
*    * *
*/

public class StarFigures {
    public static void main(String[] args){
        method4();
        System.out.println();
        method4();
        method1();
        System.out.println();
        method3();
        method4();
    }

    public static void method1() {
        System.out.println("*****");
        System.out.println("*****");
    }
    
    public static void method2() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    
    public static void method3() {
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
    
    public static void method4() {
        method1();
        method2();
    }
}

