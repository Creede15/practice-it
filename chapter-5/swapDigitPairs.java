/*
* Write a method named swapDigitPairs that accepts an integer n as a parameter
* and returns a new integer whose value is similar to n's but with each pair 
* of digits swapped in order. 
*/

public static int swapDigitPairs(int num) {
    int power = 1;
    int swapNum = 0;
    
    while (num >= 10) {
        int digit1 = num % 10;
        num /= 10;
        int digit2 = num % 10;
        num /= 10;
        swapNum += digit1 * (int) Math.pow(10, power) + digit2 * (int) Math.pow(10, power - 1);
        power += 2;
    }
    
    swapNum += num * Math.pow(10, power -1);
    return swapNum;
}
