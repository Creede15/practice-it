/*
* Write a method called removeInRange that accepts four parameters: an ArrayList of integers, 
* an element value, a starting index, and an ending index. The method's behavior is to 
* remove all occurrences of the given element that appear in the list between the starting 
* index (inclusive) and the ending index (exclusive). Other values and occurrences of 
* the given value that appear outside the given index range are not affected. 
*/

public static void removeInRange(ArrayList<Integer> array, int value, int start, int end) {

    for (int i = start; i < end; i++) {
        if (array.get(i) == value) {
            array.remove(i);
            i--;
            end--;
        }
    }
    
}
