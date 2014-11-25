/*
* Write a method named hasAnOddDigit that returns whether any digit of a
* positive integer is odd. Your method should return true if the number 
* has at least one odd digit and false if none of its digits are odd. 
*/

public static boolean hasAnOddDigit(int num) {
    if (num == 0) {
        return false;
    } else {
        num = Math.abs(num);
        
        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                return true;
            }
            num /= 10;
        }
        
        return false;
    }
}
