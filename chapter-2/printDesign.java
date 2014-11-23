/*
* Write a method called printDesign that produces the following output. 
* Use nested for loops to capture the structure of the figure.
*
* -----1-----
* ----333----
* ---55555---
* --7777777--
* -999999999-
*/

public static void printDesign() {
    int num = 1;
    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 6 - i; j++) {
            System.out.print("-");
        }
        
        for (int k = 1; k <= num; k++) {
            System.out.print(num);     
        }
        
        num += 2;
        
        for (int j = 1; j <= 6 - i; j++) {
            System.out.print("-");
        }
        
        System.out.println();
    }
}

