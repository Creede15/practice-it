/*
* Write a recursive method indexOf that accepts two Strings as parameters
* and that returns the starting index of the first occurrence of the second
* String inside the first String (or -1 if not found). 
*/

public static int indexOf(String a, String b) {
    if (a.length() == b.length()) {
        if (a.equals(b)) {
            return 0;
        } 
    } else if (a.length() >= b.length()) {
        int length = b.length();
        if (a.substring(0, length).equals(b)) {
            return 0;
        } else {
            int result = 1 + indexOf(a.substring(1), b);
            if (result != 0) {
                return result;
            }
        }
    }
    return -1;
}
