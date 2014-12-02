/* 
* Write a recursive method repeat that accepts a string s and an integer n
* as parameters and that returns a String consisting of n copies of s. Your 
* method should throw an IllegalArgumentException if passed any negative 
* value for n. 
*/

public static String repeat(String word, int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    } else if (n == 0) {
        return "";
    } else {
        int num = n % 10;
        String temp = "";
        for (int i = 0; i < num - 1; i++) {
            temp += word;
        }
        if (n >= 10) {
            for (int i = 0; i < 9; i++) {
                word += word;
            }
        }
        return temp + word + repeat(word, n / 10);
    }
}
