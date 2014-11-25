/*
* Write a method named digitRange that accepts an integer as a parameter 
* and returns the range of values of its digits. The range is defined as 
* 1 more than the difference between the largest and smallest digit value.
*/

public static int digitRange(int num) {
    num = Math.abs(num);
    int min = 10;
    int max = 0;
    if (num / 10 == 0) {
        return 1;
    }
    
    while (num != 0) {
        int digit = num % 10;
        num /= 10;
        if (digit > max) {
            max = digit;
        } else if (digit < min) {
            min = digit;
        }
    }   
    
    return max - min + 1;
}
