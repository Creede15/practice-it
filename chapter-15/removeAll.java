/*
* Write a method removeAll that takes an integer value as a parameter and
* that removes all occurrences of the given value from the list. You can 
* assume that a method called remove exists that takes an index as a 
* parameter and that removes the value at the given index. 
*/

public void removeAll(int value) {
    for (int i = 0; i < size; i++) {
        if (elementData[i] == value) {
            remove(i);
            i--;
        }
    }
}
