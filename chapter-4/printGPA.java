/*
* Write a method named printGPA that calculates a student's grade point average.
* The user will type a line of input containing the student's name, then a number
* of scores, followed by that many integer scores. Here are two example dialogues: 
*
* Enter a student record: Maria 5 72 91 84 89 78
* Maria's grade is 82.8
* Enter a student record: Jordan 4 86 71 62 90
* Jordan's grade is 77.25
*/

public static void printGPA() {
    Scanner console = new Scanner(System.in);
    System.out.print("Enter a student record: ");
    String name = console.next();
    int numScore = console.nextInt();
    double sum = 0.0;
    
    for (int i = 0; i < numScore; i++) {
        int score = console.nextInt();
        sum += score;
    }
    
    double average = sum / numScore;
    System.out.println(name + "'s grade is " + average);
}
