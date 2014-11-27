/* 
* Write a static method named isSorted that accepts an array of doubles as
* a parameter and returns true if the list is in sorted (nondecreasing) 
* order and false otherwise. Assume the array has at least one element. A
* one-element array is considered to be sorted. 
*/

public static boolean isSorted(double[] array) {
    double pre = array[0];
    
    for (int i = 1; i < array.length; i++) {
        double current = array[i];
        if (pre >= current) {
            return false;
        }
        pre = current;
    }
    
    return true;
}
