/*
* Write a method sumTo that accepts an integer parameter n and returns 
* the sum of the first n reciprocals. 
*/

public static double sumTo(int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    } else if (n == 0) {
        return 0.0;
    } else {
        return 1.0 / n + sumTo(n - 1);
    }
}
