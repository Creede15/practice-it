/*
* Write a method named allDigitsOdd that returns whether every
* digit of a given integer is odd. Your method should return 
* true if the number consists entirely of odd digits and false
* if any of its digits are even. Your method should work for
* positive and negative numbers. 
*/

public static boolean allDigitsOdd(int num) {
    boolean result = true;
    num = Math.abs(num);
    if (num == 0) {
        result = false;
    }
    
    while (num != 0) {
        int digit = num % 10;
        if (digit % 2 == 0) {
            result = false;
        }
        num /= 10;
    }
    
    return result;
}
