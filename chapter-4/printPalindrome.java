/*
* Write a method called printPalindrome that accepts a Scanner for the console 
* as a parameter, and prompts the user to enter one or more words and prints 
* whether the entered String is a palindrome
*/

public static void printPalindrome(Scanner console) {
    System.out.print("Type one or more words: ");
    String word = console.next();
    System.out.println();
    boolean palindrome = true;
    int length = word.length();
    
    for (int i = 0; i < word.length(); i++) {
        if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(word.charAt(length - 1 - i))) {
            palindrome = false;
        }
    }
    
    if (palindrome == true) {
        System.out.println(word + " is a palindrome!");
    } else {
        System.out.println(word + " is not a palindrome.");
    }
}
