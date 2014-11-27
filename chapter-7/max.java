/*
* Write a method called max that accepts an array of integers as a parameter 
* and returns the maximum value in the array.
*/

public static int max(int[] array) {
    int max = array[0];
    
    for (int i = 1; i < array.length; i++) {
        int num = array[i];
        if (num > max) {
            max = num;
        }
    }
    
    return max;
}
