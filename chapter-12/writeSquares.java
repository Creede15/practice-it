/*
* Write a method writeSquares that accepts an integer parameter n and prints the first n 
* squares separated by commas, with the odd squares in descending order followed by the 
* even squares in ascending order. Your method should throw an IllegalArgumentException if 
* passed a value less than 1. 
*/

public static void writeSquares(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        System.out.print(1);
    } else if (n % 2 != 0) {
        System.out.print(n * n + ", ");
        writeSquares(n - 2);
        System.out.print(", " + (n - 1) * (n - 1));
    } else {
        System.out.print((n - 1) * (n - 1));
        if (n != 2) {
            System.out.print(", ");
            writeSquares(n - 2);
        }
        System.out.print(", " + n * n);
    }
}
