/*
* Write a method called printTriangleType that accepts three integer arguments
* representing the lengths of the sides of a triangle and prints what type of 
* triangle it is. The three types are equilateral, isosceles, and scalene. An 
* equilateral triangle has all three sides the same length, an isosceles 
* triangle has two sides the same length, and a scalene triangle has three 
* sides of different lengths.

public static void printTriangleType(int a, int b, int c) {
    if (a == b && b == c) {
        System.out.println("equilateral");
    } else if (a == b || b == c || a == c) {
        System.out.println("isosceles");
    } else {
        System.out.println("scalene");
    }
}
