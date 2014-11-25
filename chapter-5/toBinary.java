/*
* Write a method named toBinary that accepts an integer as a parameter
* and returns a string of that number's representation in binary.
*/

public static String toBinary(int num) {
    String result = "";
    result = num % 2 + result;
    num /= 2;
    
    while (num != 0) {
        result = num % 2 + result;
        num /= 2;
    }
    
    return result;
}
