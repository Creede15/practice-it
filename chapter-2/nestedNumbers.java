/*
* Write nested for loops that produce the following output:
*
* 000111222333444555666777888999
* 000111222333444555666777888999
* 000111222333444555666777888999
*/

for (int i = 1; i <= 3; i++) {
    for (int j = 0; j < 10; j++) {
        for (int k = 1; k <= 3; k++) {
            System.out.print(j);
        }
    }
    System.out.println();
}

