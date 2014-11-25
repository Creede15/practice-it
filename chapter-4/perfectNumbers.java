/*
* A "perfect number" is a positive integer that is the sum of all its proper
* factors (that is, factors including 1 but not the number itself). The first
* two perfect numbers are 6 and 28, since 1+2+3=6 and 1+2+4+7+14=28. Write a
* static method perfectNumbers that takes an integer max as an argument and
* prints out all perfect numbers that are less than or equal to max. 
*/

public static void perfectNumbers(int max) {
    String numbers = "";
    
    for (int i = 1; i <= max; i++) {
        int sum = 0;
        
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
                sum += j;
            }
        }
        
        if (sum == i) {
            numbers += i + " ";
        }
    }
    
    System.out.println("Perfect numbers up to " + max + ": " + numbers);
}
