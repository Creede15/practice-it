/*
* Write a method evenDigits that accepts an integer parameter n and that returns the integer 
* formed by removing the odd digits from n. If a negative number with even digits other 
* than 0 is passed to the method, the result should also be negative. Leading zeros in 
* the result should be ignored and if there are no even digits other than 0 in the number, 
* the method should return 0. 
*/

public static int evenDigits(int n) {
    if (n == 0) {
        return 0;
    } else {
        int num = n % 10;
        if (num % 2 == 0) {
            return num + evenDigits(n / 10) * 10;
        } else {
            return evenDigits(n / 10);
        }
    }
}
