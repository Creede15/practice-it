/*
* Write a method called swapPairs that accepts a String as a parameter
* and returns that String with each pair of adjacent letters reversed.
* If the String has an odd number of letters, the last letter is unchanged. 
*/

public static String swapPairs(String string) {
    String newString = "";
    
    for (int i = 0; i < string.length() / 2; i++) {
        newString += string.charAt(2 * i + 1);
        newString += string.charAt(2 * i);
    }
    
    if (string.length() % 2 != 0) {
        newString += string.charAt(string.length() - 1);
    }
    
    return newString;
}
