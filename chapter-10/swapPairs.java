/*
* Write a method swapPairs that switches the order of values in an ArrayList of Strings in 
* a pairwise fashion. Your method should switch the order of the first two values, then 
* switch the order of the next two, switch the order of the next two, and so on. If there 
* are an odd number of values in the list, the final element is not moved. 
*/

public static void swapPairs(ArrayList<String> array) {

    for (int i = 0; i < array.size() / 2; i++) {
        String temp = array.get(2 * i + 1);
        array.set(2 * i + 1, array.get(2 * i));
        array.set(2 * i, temp);
    }
    
}
