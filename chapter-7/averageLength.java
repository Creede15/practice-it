/*
* Write a method averageLength of code that computes and returns the average
* String length of the elements of an array of Strings.
*/

public static double averageLength(String[] array) {
    double totalLength = 0.0;
    
    for (int i = 0; i < array.length; i++) {
        totalLength += array[i].length();
    }
    
    return totalLength / array.length;
}
