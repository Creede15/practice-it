/*
* Write a method named minGap that accepts an integer array as a parameter and returns the 
* minimum 'gap' between adjacent values in the array. The gap between two adjacent values 
* in a array is defined as the second value minus the first value. 
*/

public static int minGap(int[] array) {
    if (array.length < 2) {
        return 0;
    } else {
        int min = array[1] - array[0];
        
        for (int i = 1; i < array.length - 1; i++) {
            int difference = array[i + 1] - array[i];
            if (difference < min) {
                min = difference;
            }
        }
        
        return min;
    }
}
