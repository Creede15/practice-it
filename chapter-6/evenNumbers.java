/*
* Write a method named evenNumbers that accepts a Scanner as a parameter
* reading input from a file containing a series of integers, and report 
* various statistics about the integers. You may assume that there is at
* least one integer in the file. Report the total number of numbers, the 
* sum of the numbers, the count of even numbers and the percent of even 
* numbers. 
*/

public static void evenNumbers(Scanner console) {
    int totalNum = 0;
    int sum = 0;
    int evenNum = 0;
    
    while (console.hasNextInt()) {
        int num = console.nextInt();
        totalNum++;
        sum += num;
        if (num % 2 == 0) {
            evenNum++;
        }
    }
    
    System.out.printf("%d numbers, sum = %d\n", totalNum, sum);
    System.out.printf("%d evens (%.2f%%)\n", evenNum, 100.0 * evenNum / totalNum);
}
