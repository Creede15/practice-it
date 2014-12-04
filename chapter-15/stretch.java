/*
* Write a method stretch that takes an integer n as a parameter and that 
* increases a list of integers by a factor of n by replacing each integer
* in the original list with n copies of that integer. 
*/

public void stretch(int n) {
    if (n <= 0) {
        clear();
    } else {
        int oldSize = size;
        
        for (int i = 0; i < oldSize; i++) {
            
            for (int j = 1; j < n; j++) {
                add(n * i + j, elementData[n * i]);
            }
        }
    }
}
