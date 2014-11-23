/*
* SlashFigure2 uses a global constant for the figure's height.
*
* the output of a height 7 figure as below:
* !!!!!!!!!!!!!!!!!!!!!!!!!!
* \\!!!!!!!!!!!!!!!!!!!!!!//
* \\\\!!!!!!!!!!!!!!!!!!////
* \\\\\\!!!!!!!!!!!!!!//////
* \\\\\\\\!!!!!!!!!!////////
* \\\\\\\\\\!!!!!!//////////
* \\\\\\\\\\\\!!////////////
*/

public class SlashFigure2 {
    public static final int HEIGHT = 4;
    public static void main(String[] args) {
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print("\\");
            }
            
            for (int j = 1; j <= 4 * HEIGHT - 4 * i + 2; j++) {
                System.out.print("!");
            }
            
            for (int j = 1; j <= 2 * i - 2; j++) {
                System.out.print("/");
            }
            
            System.out.println();
        }
    }
}
