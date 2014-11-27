/*
* Write a method called collapse that accepts an array of integers as a parameter and 
* returns a new array containing the result of replacing each pair of integers with the 
* sum of that pair. 
*/

public static int[] collapse(int[] array) {
    int length = array.length;
    int[] newArray;
    if (length % 2 == 0) {
        newArray = new int[length / 2];
    } else {
        newArray = new int[length / 2 + 1];
        newArray[length / 2] = array[array.length - 1];
    }
    
    for (int i = 0; i < length / 2; i++) {
        newArray[i] = array[2 * i] + array[2 * i + 1];
    } 
    
    return newArray;
}
