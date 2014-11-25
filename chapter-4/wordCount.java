/*
* Write a method called wordCount that accepts a String as its parameter
* and returns the number of words in the String. A word is a sequence of
* one or more nonspace characters (any character other than ' ').
*/

public static int wordCount(String string) {
    int numOfWords = 0;
    char firstChar = string.charAt(0);
    
    if (firstChar != ' ') {
        numOfWords++;
    }
    
    for (int i = 1; i < string.length(); i++) {
        char secondChar = string.charAt(i);
        if (firstChar == ' ' && secondChar != ' ') {
            numOfWords++;
        } 
        firstChar = secondChar;
    }
    
    return numOfWords;
}
