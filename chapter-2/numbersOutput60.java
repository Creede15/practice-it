/*
* write nested for loops to produce the following output, with each line 60 characters wide: 
*
*          |         |         |         |         |         |
* 123456789012345678901234567890123456789012345678901234567890
*/

for (int i = 1; i <= 6; i++) {
    for (int j = 1; j <= 9; j++) {
        System.out.print(" ");
    }
    System.out.print("|");
}

System.out.println();

for (int i = 1; i <= 6; i++) {
    System.out.print("1234567890");
}
