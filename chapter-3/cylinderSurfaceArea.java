/*
* Write a method called cylinderSurfaceArea that accepts a radius and height (both real numbers)
* as parameters and returns the surface area of a cylinder with those dimensions.
*/

public static double cylinderSurfaceArea(double radius, double height) {
    return 2 * Math.PI * radius * (radius + height);
}
