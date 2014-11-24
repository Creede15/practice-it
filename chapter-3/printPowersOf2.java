/*
* Write a method called printPowersOf2 that accepts a maximum number as an argument and prints 
* each power of 2 from 20 (1) up to that maximum power, inclusive.
*/

public static void printPowersOf2(int max) {
    for (int i = 0; i <= max; i++) {
        System.out.print((int) Math.pow(2, i) + " ");
    }
    
    System.out.println();
}
