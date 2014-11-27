/*
* Write a method isPalindrome that accepts an array of Strings as its argument and returns 
* true if that array is a palindrome (if it reads the same forwards as backwards) and /false
* if not. 
*/

public static boolean isPalindrome(String[] array) {

    for (int i = 0; i < array.length / 2; i++) {
        if(!array[i].equals(array[array.length - 1 - i])) {
            return false;
        }
    }
    
    return true;
}
