/*
* Suppose you have a real number variable x. Write a single Java statement that 
* declares and computes a variable y storing the result of the following computation,
* but modify the expression to use the * operator only four times while computing an equivalent value.
*
* y = 12.3x4 - 9.1x3 + 19.3x2 - 4.6x + 34.2
*/

double y = x * (x * (19.3 + x * (12.3 * x - 9.1)) - 4.6) + 34.2;
