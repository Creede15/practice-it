/*
* Write a program in a class named StarFigure that produces the following output using for loops.
*
* ////////////////\\\\\\\\\\\\\\\\
* ////////////********\\\\\\\\\\\\
* ////////****************\\\\\\\\
* ////************************\\\\
* ********************************
*/

public class StarFigure {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
        
            for (int j = 1; j <= 20 - 4 * i; j++) {
                System.out.print("/");
            }
            
            for (int j = 1; j <= 8 * i - 8; j++) {
                System.out.print("*");
            }
            
            for (int j = 1; j <= 20 - 4 * i; j++) {
                System.out.print("\\");
            }
            
            System.out.println();
        }
    }
}

