/*
* Write a method called countQuarters that takes an int representing a number of cents 
* as a parameter and returns the number of quarter coins represented by that many cents.
*/

public static int countQuarters(int cents) {
    cents = cents % 100;
    return cents / 25;
}
