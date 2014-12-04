/*
* Write a method mirror that doubles the size of a list of integers 
* by appending the mirror image of the original sequence to the end
* of the list. The mirror image is the same sequence of values in 
* reverse order. 
*/

public void mirror() {
    for (int i = size - 1; i >= 0; i--) {
        add(elementData[i]);
    }
}
