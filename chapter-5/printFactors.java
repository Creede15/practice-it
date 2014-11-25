/*
* Write a method named printFactors that accepts an integer as its
* parameter and uses a fencepost loop to print the factors of that
* number, separated by the word " and ". 
*/

public static void printFactors(int num) {
    System.out.print("1");
    
    for (int i = 2; i <= num; i++) {
        if (num % i == 0) {
            System.out.print(" and " + i);
        }
    }
}
