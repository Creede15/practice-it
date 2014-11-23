/* 
* Write for loops to produce the following output, with each line 40 characters wide: 
* ----------------------------------------
* _-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
* 1122334455667788990011223344556677889900
* ----------------------------------------
*/

for (int a = 1; a <= 40; a++) {
    System.out.print("-");
}

System.out.println();

for (int b = 1; b <= 10; b++) {
    System.out.print("_-^-");
}

System.out.println();

for (int c = 1; c <= 2; c++) {
    System.out.print("11223344556677889900");
}

System.out.println();

for (int a = 1; a <= 40; a++) {
    System.out.print("-");
}
