/*
* The following code attempts to examine a String and return whether it contains a given letter. 
*/

public static boolean contains(String str, char ch) {
    boolean found = false;
    
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch) {
            found = true;
        } 
    }
    
    return found;
}
