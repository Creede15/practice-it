/*
* Write a static method named range that takes an array of integers as a parameter and 
* returns the range of values contained in the array. The range of an array is defined to 
* be one more than the difference between its largest and smallest element. 
*/

public static int range(int[] array) {
    int min = array[0];
    int max = array[0];
    
    for (int i = 1; i < array.length; i++) {
        min = Math.min(min, array[i]);
        max = Math.max(max, array[i]);
    }
    
    return max - min + 1;
}
