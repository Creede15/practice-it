/*
* Write a method minToFront that takes an ArrayList of integers as a parameter 
* and that moves the minimum value in the list to the front, otherwise preserving 
* the order of the elements.
*/

public static void minToFront(ArrayList<Integer> array) {
    int minIndex = 0;
    
    for (int i = 1; i < array.size(); i++) {
        if (array.get(minIndex) > array.get(i)) {
            minIndex = i;
        }
    }
    
    int minValue = array.remove(minIndex);
    array.add(0, minValue);
}
