/*
* Write a method called triangleArea that accepts the three side lengths of a triangle 
* (all real numbers) as parameters and returns the area of a triangle with those side lengths. 
* To compute the area, use Heron's formula, which states that the area of a triangle whose
* three sides have lengths a, b, and c
*/

public static double triangleArea(double a, double b, double c) {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}

