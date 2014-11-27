/*
* Write a method called append that accepts two integer arrays as parameters and returns a 
* new array that contains the result of appending the second array's values at the end 
* of the first array. 
*/

public static int[] append(int[] list1, int[] list2) {
    int[] newList = new int[list1.length + list2.length];
    int index = 0;
    
    for (int i = 0; i < list1.length; i++) {
        newList[index] = list1[i];
        index++;
    }
    
    for (int i = 0; i < list2.length; i++) {
        newList[index] = list2[i];
        index++;
    }
    
    return newList;
}
