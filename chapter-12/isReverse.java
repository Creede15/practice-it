/*
* Write a recursive method isReverse that accepts two strings as a parameter and returns true 
* if the two strings contain the same sequence of characters as each other but in the 
* opposite order (ignoring capitalization), and false otherwise. You may assume that the 
* strings passed are not null. 
*/

public static boolean isReverse(String a, String b) {
    if (a.length() == 0 && b.length() == 0) {
        return true;
    } else if (a.length() == b.length()) {
        int length = b.length();
        char letter1 = Character.toUpperCase(a.charAt(0));
        char letter2 = Character.toUpperCase(b.charAt(length - 1));
        if (letter1 == letter2) {
            return isReverse(a.substring(1), b.substring(0, length - 1));
        } else {
            return false;
        }
    }
    return false;
}
