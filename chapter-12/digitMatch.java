/*
* Write a recursive method digitMatch that accepts two non-negative integers as parameters and 
* that returns the number of digits that match between them. Two digits match if they are 
* equal and have the same position relative to the end of the number (i.e. starting with 
* the ones digit). In other words, the method should compare the last digits of each number, 
* the second-to-last digits of each number, the third-to-last digits of each number, and 
* so forth, counting how many pairs match. Your method should throw an IllegalArgumentException if 
* either of the two parameters is negative. 
*/

public static int digitMatch(int a, int b) {
    if (a < 0 || b < 0) {
        throw new IllegalArgumentException();
    } else if (a == 0 && b == 0) {
        return 1;
    } else {
        int result = 0;
        if (a % 10 == b % 10) {
            result++;
        }
        if (a / 10 == 0 || b / 10 == 0) {
            return result;
        }
        return result + digitMatch(a / 10, b / 10);
    }    
}
