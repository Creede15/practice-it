/*
* Write a method named numUnique that takes three integers as parameters and 
* that returns the number of unique integers among the three. 
*/

public static int numUnique(int a, int b, int c) {
    int count = 0;
    
    if (a != b) {
        count++;
    }
    
    if (b != c) {
        count++;
    }
    
    if (a != c) {
        count++;
    }
    
    if (a == b && b == c) {
        count++;
    }
    
    return count;
}
