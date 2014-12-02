/*
* Write a method countBinary that accepts an integer n as a parameter and that prints all 
* binary numbers that have n digits in ascending order, printing each value on a separate line. 
* All n digits should be shown for all numbers, including leading zeros if necessary. You 
* may assume that n is non-negative. If n is 0, a blank line of output should be produced. 
*/

public static void countBinary(int n) {
    if (n == 0) {
        System.out.println();
    } else {
        countBinary(0, (int)Math.pow(2, n), n);
    }
}

public static void countBinary(int min, int max, int n) {
    if (min < max) {
        String s = Integer.toBinaryString(min);
        s = String.format("%" + n + "s", s).replace(' ', '0');
        System.out.println(s);
        countBinary(min + 1, max, n);
    }
}
