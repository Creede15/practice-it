/*
* Write a method removeShorterStrings that takes an ArrayList of Strings
* as a parameter and that removes from each successive pair of values the
* shorter string in the pair. If there is a tie (both strings have the same
* length), your method should remove the first string in the pair. If there 
* is an odd number of strings in the list, the final value should be kept in 
* the list. 
*/

public static void removeShorterStrings(ArrayList<String> array) {
    int oldSize = array.size();
    
    for (int i = 0; i < oldSize / 2; i++) {
        int length1 = array.get(i).length();
        int length2 = array.get(i + 1).length();
        if (length1 == length2) {
            array.remove(i);
        } else if (length1 > length2) {
            array.remove(i + 1);
        } else {
            array.remove(i);
        }
    }
    
}
