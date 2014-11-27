/*
* Write a method called average that computes the average (arithmetic mean) of all
* elements in an array of integers and returns the answer as a double.
*/

public static double average(int[] array) {
    double sum = 0;
    
    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    
    return sum / array.length;
}
