/*
* Write a method named showTwos that shows the factors of 2 in a given integer.
*/

public static void showTwos(int num) {
    System.out.print(num + " = ");
    
    while (num % 2 == 0) {
          System.out.print("2 * ");
          num /= 2;
    }
    
    System.out.print(num);
}
