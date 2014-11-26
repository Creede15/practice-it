/*
* Write a method named negativeSum that accepts a Scanner as a parameter reading
* input from a file containing a series of integers, and determine whether the
* sum starting from the first number is ever negative. The method should print 
* a message indicating whether a negative sum is possible and should return true 
* if a negative sum can be reached and false if not.
*/

public static boolean negativeSum(Scanner console) {
    int sum = 0;
    int step = 0;
    
    while (console.hasNextInt()) {
        sum += console.nextInt();
        step++;
        if (sum < 0) {
            System.out.printf("%d after %d steps\n", sum, step);
            return true;
        }
    }
    
    System.out.println("no negative sum");
    return false;
}
