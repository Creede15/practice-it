/*
* Write a piece of code that uses a for loop to compute and print the first 12 Fibonacci numbers.
*
* The first 12 Fibonacci numbers are:
* 1 1 2 3 5 8 13 21 34 55 89 144
*/

int num1 = 0;
int num2 = 1;
for (int i = 1; i <= 12; i++) {
    System.out.print(num2 + " ");
    int nextNum = num1 + num2;
    num1 = num2;
    num2 = nextNum;
}
