/*
* Write a method doubleList that takes an ArrayList of Strings as a 
* parameter and that replaces every string with two of that string. 
*/

public static void doubleList(ArrayList<String> array) {
    int oldSize = array.size();
    
    for (int i = 0; i < oldSize; i++) {
        String word = array.get(2 * i);
        array.add(2 * i + 1, word);
    }
    
}
