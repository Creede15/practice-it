/*
* Write a method removeEvenLength that takes a Set of strings as a parameter 
* and that removes all of the strings of even length from the set. 
*/

public static void removeEvenLength(Set<String> set) {
    Iterator<String> i = set.iterator();
    
    while (i.hasNext()) {
        String word = i.next();
        if (word.length() % 2 == 0) {
            i.remove();
        }
    }
}
