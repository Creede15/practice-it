/*
* Write a method writeNums that accepts an integer parameter n and prints 
* the first n integers starting with 1 in sequential order, separated by
* commas. Your method should throw an IllegalArgumentException if passed 
* a value less than 1. 
*/

public static void writeNums(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        System.out.print("1");
    } else {
        writeNums(n - 1);
        System.out.print(", " + n);
    }
}
