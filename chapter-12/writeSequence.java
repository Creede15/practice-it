/* 
* Write a method writeSequence that accepts an integer n as a parameter and
* prints a symmetric sequence of n numbers with descending integers ending in 
* 1 followed by ascending integers beginning with 1. Your method should throw 
* an IllegalArgumentException if passed a value less than 1. 
*/

public static void writeSequence(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        System.out.print("1 ");
    } else {
        System.out.print((n + 1) / 2 + " ");
        if (n != 2) {
            writeSequence(n - 2);
        }
        System.out.print((n + 1) / 2 + " ");
    }
}
