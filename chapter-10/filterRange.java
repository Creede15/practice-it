/*
* Write a method filterRange that accepts an ArrayList of integers and
* two integer values min and max as parameters and removes all elements 
* whose values are in the range min through max (inclusive) from the list. 
*  If no elements in range min-max are found in the list, the list's contents
* are unchanged. If an empty list is passed, the list remains empty. You may
* assume that the list is not null. 
*/

public static void filterRange(ArrayList<Integer> array, int min, int max) {

    for (int i = 0; i < array.size(); i++) {
        int num = array.get(i);
        if (num <= max && num >= min) {
            array.remove(i);
            i--;
        }
    }
    
}
