/*
* Write a method printSquares that uses recursive backtracking to find all 
* ways to express an integer as a sum of squares of unique positive integers.
*/

public static void printSquares(int n) {
    printSquares(n, 1, new TreeSet<Integer>());
}

private static void printSquares(int n, int index, Set<Integer> squares) {
    if (n == 0) {
        printHelper(squares);
    } else if (n > 0) {
        int root = (int) Math.sqrt(n);
        for (int i = index; i <= root; i++) {
            if (n - i * i >= 0) {
                squares.add(i);
                printSquares(n - i * i, i + 1, squares);
                squares.remove(i);
            } 
        }
    }
}
