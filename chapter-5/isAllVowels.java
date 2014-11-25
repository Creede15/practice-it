/*
* Write a method named isAllVowels that returns whether a String consists
* entirely of vowels (a, e, i, o, or u, case-insensitively). If every 
* character of the String is a vowel, your method should return true.
* If any character of the String is a non-vowel, your method should return
* false. Your method should return true if passed the empty string, since 
* it does not contain any non-vowel characters. 
*/

public static boolean isAllVowels(String word) {
    int index = 0;
    
    while (index < word.length()) {
        char letter = word.charAt(index);
        letter = Character.toLowerCase(letter);
        if (letter != 'a' && letter != 'e' && letter != 'i' &&
           letter != 'o' && letter != 'u') {
            return false;
        }
        index++;
    }
    
    return true;
}
