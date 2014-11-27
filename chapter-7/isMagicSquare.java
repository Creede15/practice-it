/*
* Write a method called isMagicSquare that accepts a two-dimensional array of integers as 
* a parameter and returns true if it is a magic square. A square matrix is a magic square 
* if it is square in shape (same number of rows as columns, and every row the same length), 
* and all of its row, column, and diagonal sums are equal. 
*/

public static boolean isMagicSquare(int[][] array) {
    boolean result = true;
    
    for (int row = 0; row < array.length; row++) {
        if (array[row].length != array.length) {
            result = false;
        }
    }
    
    if (result) {
        int sum = 0;
        
        for (int col = 0; col < array.length; col++) {
            sum += array[0][col];
        }
        
        for (int row = 1; row < array.length; row++) {
            int newSum = 0;
            
            for (int col = 0; col < array[row].length; col++) {
                newSum += array[row][col];
            }
            
            if (sum != newSum) {
                result = false;
            }
        }
    }
        
    return result;
}
