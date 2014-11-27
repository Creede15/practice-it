/*
* Write a method called countInRange that accepts an array of integers, a minimum value, 
* and a maximum value as parameters and returns the count of how many elements from the 
* array fall between the minimum and maximum (inclusive). 
*/

public static int countInRange(int[] array, int min, int max) {
    int count = 0;
    
    for (int i = 0; i < array.length; i++) {
        int num = array[i];
        if (num >= min && num <= max) {
            count++;
        }
    }
    
    return count;
}
