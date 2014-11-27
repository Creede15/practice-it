/*
* Write a method called stdev that returns the standard deviation of an array of integers. Standard 
* deviation is computed by taking the square root of the sum of the squares of the differences 
* between each element and the mean, divided by one less than the number of elements. 
*/

public static double stdev(int[] array) {
    int sum = 0;
    
    for (int i = 0; i < array.length; i++) {
        sum += array[i];
    }
    
    double average = (double)sum / array.length;
    double top = 0;
    
    for (int i = 0; i < array.length; i++) {
        top += Math.pow(array[i] - average, 2);
    }
    
    return Math.sqrt(top / (array.length - 1));
}
