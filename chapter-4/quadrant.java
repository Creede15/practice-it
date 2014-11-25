/*
* Write a static method called quadrant that takes as parameters a pair
* of real numbers representing an (x, y) point and that returns the quadrant
* number for that point. Recall that quadrants are numbered as integers from 
* 1 to 4 with the upper-right quadrant numbered 1 and the subsequent quadrants 
* numbered in a counter-clockwise fashion
*/

public static int quadrant(double x, double y) {
    if (x > 0 && y > 0) {
        return 1;
    } else if (x < 0 && y > 0) {
        return 2;
    } else if (x < 0 && y < 0) {
        return 3;
    } else if (x > 0 && y < 0) {
        return 4;
    } else {
        return 0;
    }
}
