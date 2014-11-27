/*
* Write a method named swapPairs that accepts an array of strings as a parameter and switches 
* the order of values in a pairwise fashion. Your method should switch the order of the 
* first two values, then switch the order of the next two, switch the order of the next 
* two, and so on. 
*/

public static void swapPairs(String[] array) {

    for (int i = 0; i < array.length / 2; i++) {
        String temp = array[2 * i];
        array[2 * i] = array[2 * i + 1];
        array[2 * i + 1] = temp;
    }
    
}
