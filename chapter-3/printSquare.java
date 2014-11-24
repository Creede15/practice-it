/*
* Write a method called printSquare that takes in two integer parameters, a min and a max, 
* and prints the numbers in the range from min to max inclusive in a square pattern.
*/

public static void printSquare(int min, int max) {
    for (int i = min; i <= max; i++) { 
    
        for (int j = i; j <= max; j++) {
            System.out.print(j);
        }
        
        for (int j = min; j < i; j++) {
            System.out.print(j);
        }
        
        System.out.println();
    }
}
