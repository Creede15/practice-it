/*
* Write a static method named xo that accepts an integer size as a parameter 
* and prints a square of size by size characters, where all characters are "o" 
* except that an "x" pattern of "x" characters has been drawn from the corners
* of the square. In other words, on the first line, the first and last characters
* are "x"; on the second line, the second and second-from-last characters are "x";
* and so on. If 0 or less is passed for the size, no output should be produced. 
*/

public static void xo(int size) {

    for (int line = 1; line <= size; line++) {
        if (line > (size + 1) / 2) {
            for (int o = 0; o < size - line; o++) {
                System.out.print("o");
            }
        } else {
            for (int o = 0; o < line - 1; o++) {
               System.out.print("o");
            }
        }
        System.out.print("x");
        
        if (line > (size + 1) / 2) {
            for (int o = 0; o < 2 * line - size - 2; o++) {
                System.out.print("o");
            }
        } else {
            for (int o = 0; o < size - 2 * line; o++) {
                System.out.print("o");
            }
        }
        
        if (size % 2 == 0 || line != size / 2 + 1) {
            System.out.print("x");
        }
        
        if (line > (size + 1) / 2) {
            for (int o = 0; o < size - line; o++) {
                System.out.print("o");
            }
        } else {
            for (int o = 0; o < line - 1; o++) {
                System.out.print("o");
            }
        }
        
        System.out.println();
    } 
}
