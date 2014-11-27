/*
* Write a static method named vowelCount that accepts a String as a parameter and produces 
* and returns an array of integers representing the counts of each vowel in the String. The 
* array returned by your method should hold 5 elements: the first is the count of As, 
* the second is the count of Es, the third Is, the fourth Os, and the fifth Us. Assume that 
* the string contains no uppercase letters. 
*/

public static int[] vowelCount(String string) {
    int[] array = new int[5];
    
    for (int i = 0; i < string.length(); i++) {
        char letter = string.charAt(i);
        if(letter == 'a') {
            array[0]++;
        } else if (letter == 'e') {
            array[1]++;
        } else if (letter == 'i') {
            array[2]++;
        } else if (letter == 'o') {
            array[3]++;
        } else if (letter == 'u') {
            array[4]++;
        } 
    }
    
    return array;
}
