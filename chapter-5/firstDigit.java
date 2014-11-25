/*
* Write a method named firstDigit that returns the first digit of an integer.
*/

public static int firstDigit(int num) {
    num = Math.abs(num);
    
    while (num / 10 != 0) {
        num /= 10;
    }
    
    return num;
}
