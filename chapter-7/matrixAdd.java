/*
* Write a method named matrixAdd that accepts a pair of two-dimensional arrays of integers 
* as parameters, treats the arrays as 2D matrices and adds them, returning the result. The 
* sum of two matrices A and B is a matrix C where for every row i and column j, Cij = 
* Aij + Bij. You may assume that the arrays passed as parameters have the same dimensions. 
*/

public static int[][] matrixAdd(int[][] a, int[][] b) {
    if (a.length == 0 || b.length == 0) {
        return new int[0][0];
    } else {
        int[][] result = new int[a.length][a[0].length];
        
        for (int i = 0; i < result.length; i++) {
        
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
            
        }
        
        return result;
    }
}
