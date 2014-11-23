/*
* Modify your DollarFigure program to become a new program called 
* DollarFigure2 that uses a global constant for the figure's height.
*
* Size 3:
* $$$******$$$
* **$$****$$**
* ****$**$****
*
* Size 5:
* $$$$$**********$$$$$
* **$$$$********$$$$**
* ****$$$******$$$****
* ******$$****$$******
* ********$**$********
*/

public class DollarFigure2 {
   public static final int size = 5;
   public static void main(String[] args) {
      for (int i = 0; i < size; i++) {
   
         for (int j = 1; j <= 2 * i; j++) {
            System.out.print("*");
         }
      
         for (int j = 1; j <= size - i; j++) {
            System.out.print("$");
         }
      
         for (int j = 1; j <= 2 * size - 2 * i; j++) {
            System.out.print("*");
         }
      
         for (int j = 1; j <= size - i; j++) {
            System.out.print("$");
         }
      
         for (int j = 1; j <= 2 * i; j++) {
            System.out.print("*");
         }
      
         System.out.println();
      }
   }
}
