/*
* Write a method stutter that takes an ArrayList of Strings and an integer 
* k as parameters and that replaces every string with k copies of that string.
*/

public static void stutter(ArrayList<String> array, int k) {
    if (k <= 0) {
        array.clear();
    } else {
        int oldSize = array.size();
        
        for (int i = 0; i < oldSize; i++) {
            String word = array.get(i * k);
            for (int j = 1; j < k; j++) {
                array.add(i * k + j, word);
            }
        }
        
    }
}
