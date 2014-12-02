/*
* Write a method starString that accepts an integer parameter n and 
* returns a string of stars (asterisks) 2^n long (i.e., 2 to the nth power). 
*/

public static String starString(int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    } else if (n == 0) {
        return "*";
    } else {
        return starString(n - 1) + starString(n - 1);
    }
}
