/*
* Write a method named gcd that accepts two integers as parameters
* and returns the greatest common divisor of the two numbers. 
*/

public static int gcd(int a, int b) {

    while (b != 0) {
        int c = a % b;
        a = b;
        b = c;
    }
    
    return Math.abs(a);
}
