/*
* Write a method named randomX that keeps printing lines, where each 
* line contains a random number of x characters between 5 and 19 
* inclusive, until it prints a line with 16 or more characters.
*/

public static void randomX() {
    Random random = new Random();
    int x = random.nextInt(15) + 5;
    
    while (x < 15) {
    
        for (int i = 0; i < x; i++) {
            System.out.print("x");
        }
        
        System.out.println();
        x = random.nextInt(15) + 5;
    }
    
    for (int i = 0; i < x; i++) {
        System.out.print("x");
    }
    
    System.out.println();
}
