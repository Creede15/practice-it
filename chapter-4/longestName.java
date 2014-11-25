/*
* Write a static method named longestName that reads names typed by the user 
* and prints the longest name (the name that contains the most characters). 
* Your method should accept a console Scanner and an integer n as parameters
* and should then prompt for n names. 
*/

public static void longestName(Scanner console, int numOfNames) {
    System.out.print("name #1? ");
    String name = console.next();
    boolean tie = false;
    int maxLength = name.length();
    String longestName = name.toLowerCase();
    
    for (int i = 2; i <= numOfNames; i++) {
        System.out.printf("name #%d? ", i);
        name = console.next();
        if (name.length() > maxLength) {
            maxLength = name.length();
            longestName = name.toLowerCase();
            tie = false;
        } else if (name.length() == maxLength){
            tie = true;
        }
    }
    
    longestName = longestName.substring(0,1).toUpperCase() + longestName.substring(1);
    System.out.println(longestName + "'s name is longest");
    
    if (tie == true) {
        System.out.println("(There was a tie!)");
    }
}
