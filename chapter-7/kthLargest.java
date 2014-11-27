/*
* Write a method called kthLargest that accepts an integer k and an array a as its parameters 
* and returns the element such that k elements have greater or equal value. If k = 0, return 
* the largest element; if k = 1, return the second largest element, and so on. 
*/

public static int kthLargest(int k, int[] array) {

    for (int i = 0; i < array.length; i++) {
        int min = array[i];
        
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < min) {
                int temp = min;
                array[i] = array[j];
                array[j] = temp;
                min = array[i];
            }
        }
    }
    
    return array[array.length - 1 - k];
}
