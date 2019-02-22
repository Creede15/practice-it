/*
* Write a recursive method waysToClimb that takes a non-negative integer value representing a 
* number of stairs and prints each unique way to climb a staircase of that height, taking 
* strides of one or two stairs at a time. Your method should output each way to climb the 
* stairs on its own line, using a 1 to indicate a small stride of 1 stair, and a 2 to 
* indicate a large stride of 2 stairs. There are no ways to climb zero stairs, so your method
* should produce no output if 0 is passed.
*/

public static void waysToClimb(int n) {
    if (n > 0) {
        waysToClimb(n, 0, "[");
    }
}

private static void waysToClimb(int n, int position, String result) {
    if (n - 1 == position) {
        System.out.println(result + "1]");
    } else if (n - 2 == position) {
        waysToClimb(n, position + 1, result + "1, ");
        System.out.println(result + "2]");
    } else if (n > position) {
        waysToClimb(n, position + 1, result + "1, ");
        waysToClimb(n, position + 2, result + "2, ");
    }
}
