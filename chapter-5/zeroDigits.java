/* 
* Write a method called zeroDigits that accepts an integer parameter and 
* returns the number of digits in the number that have the value 0. 
*/

public static int zeroDigits(int value) {
    int count = 0;
    
    do {
        if (value % 10 == 0) {
            count++;
        }
        value /= 10;
    } while (value > 0);
    
    return count;
}
