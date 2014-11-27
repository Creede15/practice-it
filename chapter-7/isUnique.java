/*
* Write a method named isUnique that takes an array of integers as a parameter and that 
* returns a boolean value indicating whether or not the values in the array are unique (true 
* for yes, false for no). The values in the list are considered unique if there is no 
* pair of values that are equal. 
*/

public static boolean isUnique(int[] array) {
    for (int i = 0; i < array.length; i++) {
        int min = array[i];
        
        for (int j = i + 1; j < array.length; j++) {
            if (min > array[j]) {
                array[i] = array[j];
                array[j] = min;
                min = array[i];
            }
        }
        
    }
    
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] == array[i + 1]) {
            return false;
        }
    }
    
    return true;
}
