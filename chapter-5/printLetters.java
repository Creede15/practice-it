/*
* Consider the flawed method printLetters that follows, which accepts a string 
* as its parameter and attempts to print the letters of the string, separated
* by dashes. 
*/

public static void printLetters(String text) {
    if (text.length() == 0) {
        System.out.print("");
    } else {
        System.out.print(text.charAt(0));
        
        for (int i = 1; i < text.length(); i++) {
            System.out.print("-" + text.charAt(i));
        }
    }
    System.out.println();   // to end the line of output       
}
