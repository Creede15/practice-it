/*
* Write a method multiplyEvens that returns the product of the first n even integers. 
* You should throw an IllegalArgumentException if passed a value less than or equal to 0. 
*/

public static int multiplyEvens(int n) {
    if (n <= 0) {
        throw new IllegalArgumentException();
    } else if (n == 1) {
        return 2;
    } else {
        return 2 * n * multiplyEvens(n - 1);
    }
}
