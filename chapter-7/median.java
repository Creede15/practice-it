/*
* Write a method called median that accepts an array of integers as its argument and returns 
* the median of the numbers in the array. The median is the number that will appear in 
* the middle if you arrange the elements in order. Assume that the array is of odd size 
* (so that one sole element constitutes the median) and that the numbers in the array are 
* between 0 and 99 inclusive. 
*/

public static int median(int[] array) {
    int[] spareArray = new int[100];
    
    for (int i = 0; i < array.length; i++) {
        spareArray[array[i]]++;
    }
    int sum = 0;
    int median = -1;
    
    for (int i = 0; i < spareArray.length; i++) {
        sum += spareArray[i];
        if (sum == array.length / 2 + 1) {
            return i;
        }
    }
    
    return -1;
}
