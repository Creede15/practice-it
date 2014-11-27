/*
* Assume that a two-dimensional rectangular array of integers called data 
* has been declared with four rows and seven columns. Write a for loop to 
* initialize the third row of data to store the numbers 1 through 7. 
*/

for (int c = 1; c <= data[2].length; c++) {
    data[2][c - 1] = c;
}
