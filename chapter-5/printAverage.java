/*
* Write a method named printAverage that accepts a Scanner for the
* console as a parameter and repeatedly prompts the user for numbers.
* Once any number less than zero is typed, the average of all 
* non-negative numbers typed is displayed. Display the average as a
* double, and do not round it. 
*/

public static void printAverage(Scanner console) {
    System.out.print("Type a number: ");
    double sum = 0;
    int num = console.nextInt();
    int totalNum = 0;
    
    while (num >= 0) {
        sum += num;
        System.out.print("Type a number: ");
        num = console.nextInt();
        totalNum++;
    }
    
    if (totalNum > 0) {
        System.out.println("Average was " + sum / totalNum);
    }
}
